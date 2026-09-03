package io.agora.rtc.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import io.agora.rtc.gl.JavaI420Buffer;
import io.agora.rtc.gl.VideoFrame;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(21)
public class YuvUtils {
    public static final int I420 = 35;
    public static final int NV21 = 17;
    private static final String TAG = "YuvUtils";

    public static class Plane {
        private ByteBuffer buffer;
        private int pixelStride;
        private int rowStride;

        public Plane(ByteBuffer byteBuffer, int i, int i2) {
            this.buffer = byteBuffer;
            this.rowStride = i;
            this.pixelStride = i2;
        }

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getPixelStride() {
            return this.pixelStride;
        }

        public int getRowStride() {
            return this.rowStride;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[LOOP:2: B:40:0x00b0->B:41:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca A[SYNTHETIC] */
    public static byte[] getImageData(Image image, int i) {
        ByteBuffer buffer;
        int rowStride;
        int pixelStride;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = 17;
        int i10 = 35;
        if (i8 != 35 && i8 != 17) {
            throw new IllegalArgumentException("only support COLOR_FormatI420 and COLOR_FormatNV21");
        }
        if (!supportedImageFormat(image)) {
            throw new RuntimeException("can't convert Image to byte array, format " + image.getFormat());
        }
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int iWidth = cropRect.width();
        int iHeight = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i11 = iWidth * iHeight;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i11) / 8];
        int i12 = 0;
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i14 < planes.length) {
            if (i14 != 0) {
                if (i14 != i13) {
                    if (i14 == 2) {
                        if (i8 == i10) {
                            i15 = (int) (((double) i11) * 1.25d);
                        } else if (i8 == i9) {
                            i15 = i11;
                            i16 = 2;
                        }
                    }
                } else if (i8 == i10) {
                    i15 = i11;
                } else if (i8 == i9) {
                    i15 = i11 + 1;
                    i16 = 2;
                }
                buffer = planes[i14].getBuffer();
                rowStride = planes[i14].getRowStride();
                pixelStride = planes[i14].getPixelStride();
                if (i14 == 0) {
                    i2 = i12;
                } else {
                    i2 = i13;
                }
                i3 = iWidth >> i2;
                i4 = iHeight >> i2;
                buffer.position(((cropRect.left >> i2) * pixelStride) + ((cropRect.top >> i2) * rowStride));
                i5 = 0;
                while (i5 < i4) {
                    if (pixelStride == 1 || i16 != 1) {
                        i6 = ((i3 - 1) * pixelStride) + 1;
                        buffer.get(bArr2, 0, i6);
                        for (i7 = 0; i7 < i3; i7++) {
                            bArr[i15] = bArr2[i7 * pixelStride];
                            i15 += i16;
                        }
                    } else {
                        buffer.get(bArr, i15, i3);
                        i15 += i3;
                        i6 = i3;
                    }
                    if (i5 < i4 - 1) {
                        buffer.position((buffer.position() + rowStride) - i6);
                    }
                    i5++;
                    cropRect = cropRect;
                }
                i14++;
                i8 = i;
                i9 = 17;
                i10 = 35;
                i12 = 0;
                i13 = 1;
            } else {
                i15 = i12;
            }
            i16 = i13;
            buffer = planes[i14].getBuffer();
            rowStride = planes[i14].getRowStride();
            pixelStride = planes[i14].getPixelStride();
            if (i14 == 0) {
                i2 = i12;
            } else {
                i2 = i13;
            }
            i3 = iWidth >> i2;
            i4 = iHeight >> i2;
            buffer.position(((cropRect.left >> i2) * pixelStride) + ((cropRect.top >> i2) * rowStride));
            i5 = 0;
            while (i5 < i4) {
                if (pixelStride == 1) {
                    i6 = ((i3 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i6);
                    while (i7 < i3) {
                        bArr[i15] = bArr2[i7 * pixelStride];
                        i15 += i16;
                    }
                } else {
                    i6 = ((i3 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i6);
                    while (i7 < i3) {
                        bArr[i15] = bArr2[i7 * pixelStride];
                        i15 += i16;
                    }
                }
                if (i5 < i4 - 1) {
                    buffer.position((buffer.position() + rowStride) - i6);
                }
                i5++;
                cropRect = cropRect;
            }
            i14++;
            i8 = i;
            i9 = 17;
            i10 = 35;
            i12 = 0;
            i13 = 1;
        }
        return bArr;
    }

    public static boolean supportedImageFormat(Image image) {
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }

    public static void write420ImageToFile(Image image, String str) {
        if (image == null) {
            return;
        }
        try {
            YuvImage yuvImage = new YuvImage(yuv420toNV21(image), 17, image.getWidth(), image.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, image.getWidth(), image.getHeight()), 100, byteArrayOutputStream);
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }

    public static boolean writeNV21ToFile(byte[] bArr, int i, int i2, String str) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        Rect rect = new Rect(0, 0, i, i2);
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            yuvImage.compressToJpeg(rect, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e(TAG, e.toString());
            return false;
        }
    }

    public static void writeRawData(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            File file = new File(str);
            file.createNewFile();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }

    public static void writeRgbaToFile(Buffer buffer, int i, int i2, String str) {
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(buffer);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }

    public static byte[] yuv420toNV21(Image image) {
        int i;
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int iWidth = cropRect.width();
        int iHeight = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i2 = iWidth * iHeight;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i2) / 8];
        int i3 = 0;
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i5 < planes.length) {
            if (i5 != 0) {
                if (i5 == i4) {
                    i6 = i2 + 1;
                } else if (i5 == 2) {
                    i6 = i2;
                }
                i7 = 2;
            } else {
                i6 = i3;
                i7 = i4;
            }
            ByteBuffer buffer = planes[i5].getBuffer();
            int rowStride = planes[i5].getRowStride();
            int pixelStride = planes[i5].getPixelStride();
            int i8 = i5 == 0 ? i3 : i4;
            int i9 = iWidth >> i8;
            int i10 = iHeight >> i8;
            int i11 = iWidth;
            int i12 = iHeight;
            buffer.position(((cropRect.left >> i8) * pixelStride) + ((cropRect.top >> i8) * rowStride));
            for (int i13 = 0; i13 < i10; i13++) {
                if (pixelStride == 1 && i7 == 1) {
                    buffer.get(bArr, i6, i9);
                    i6 += i9;
                    i = i9;
                } else {
                    i = ((i9 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i);
                    for (int i14 = 0; i14 < i9; i14++) {
                        bArr[i6] = bArr2[i14 * pixelStride];
                        i6 += i7;
                    }
                }
                if (i13 < i10 - 1) {
                    buffer.position((buffer.position() + rowStride) - i);
                }
            }
            i5++;
            iWidth = i11;
            iHeight = i12;
            i3 = 0;
            i4 = 1;
        }
        return bArr;
    }

    public static byte[] yuv420toNV21(byte[] bArr, int i, int i2) {
        return yuv420toNV21(JavaI420Buffer.createYUV(bArr, i, i2), i, i2);
    }

    public static byte[] yuv420toNV21(VideoFrame.I420Buffer i420Buffer, int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        Rect rect = new Rect(0, 0, i4, i5);
        int i7 = 3;
        int i8 = 1;
        int i9 = 2;
        Plane[] planeArr = {new Plane(i420Buffer.getDataY(), i420Buffer.getStrideY(), 1), new Plane(i420Buffer.getDataU(), i420Buffer.getStrideU(), 1), new Plane(i420Buffer.getDataV(), i420Buffer.getStrideV(), 1)};
        int i10 = i4 * i5;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(35) * i10) / 8];
        byte[] bArr2 = new byte[planeArr[0].getRowStride()];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < i7) {
            if (i11 == 0) {
                i12 = i6;
                i13 = i8;
            } else if (i11 == i8) {
                i12 = i10 + 1;
                i13 = i9;
            } else if (i11 == i9) {
                i13 = i9;
                i12 = i10;
            }
            ByteBuffer buffer = planeArr[i11].getBuffer();
            int rowStride = planeArr[i11].getRowStride();
            int pixelStride = planeArr[i11].getPixelStride();
            int i14 = i11 == 0 ? i6 : i8;
            int i15 = i4 >> i14;
            int i16 = i5 >> i14;
            buffer.position(((rect.left >> i14) * pixelStride) + ((rect.top >> i14) * rowStride));
            for (int i17 = 0; i17 < i16; i17++) {
                if (pixelStride == 1 && i13 == 1) {
                    buffer.get(bArr, i12, i15);
                    i12 += i15;
                    i3 = i15;
                } else {
                    i3 = ((i15 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i3);
                    for (int i18 = 0; i18 < i15; i18++) {
                        bArr[i12] = bArr2[i18 * pixelStride];
                        i12 += i13;
                    }
                }
                if (i17 < i16 - 1) {
                    buffer.position((buffer.position() + rowStride) - i3);
                }
            }
            i11++;
            i4 = i;
            i5 = i2;
            i6 = 0;
            i7 = 3;
            i9 = 2;
            i8 = 1;
        }
        return bArr;
    }
}
