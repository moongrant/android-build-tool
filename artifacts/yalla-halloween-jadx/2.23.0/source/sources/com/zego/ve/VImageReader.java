package com.zego.ve;

import android.media.Image;
import android.media.ImageReader;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class VImageReader implements ImageReader.OnImageAvailableListener {
    private static final String TAG = "VImageReader";
    private long pthis = 0;
    private ImageReader mImgRdr = null;
    private Image mImg = null;
    private Object mLock = new Object();

    public static class ImageReaderBuffer {
        private ByteBuffer uBuffer;
        private ByteBuffer vBuffer;
        private ByteBuffer yBuffer;

        public ImageReaderBuffer(Image.Plane[] planeArr) {
            this.yBuffer = planeArr[0].getBuffer();
            this.uBuffer = planeArr[1].getBuffer();
            this.vBuffer = planeArr[2].getBuffer();
        }
    }

    public static class ImageReaderFormat {
        int height;
        int uvPixelStride;
        int uvStride;
        int width;
        int yStride;

        public ImageReaderFormat(int i, int i2, Image.Plane[] planeArr) {
            this.width = i;
            this.height = i2;
            this.yStride = planeArr[0].getRowStride();
            this.uvStride = planeArr[1].getRowStride();
            this.uvPixelStride = planeArr[1].getPixelStride();
        }
    }

    private void closeImage() {
        Image image = this.mImg;
        if (image != null) {
            image.close();
        }
    }

    private ImageReaderBuffer getImageReaderBuffer() {
        try {
            Image imageAcquireLatestImage = this.mImgRdr.acquireLatestImage();
            this.mImg = imageAcquireLatestImage;
            if (imageAcquireLatestImage == null) {
                android.util.Log.e(TAG, "acquired null image from image reader");
                return null;
            }
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            if (planes.length > 1) {
                return new ImageReaderBuffer(planes);
            }
            android.util.Log.e(TAG, "image is not accessable");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private ImageReaderFormat getImageReaderFormat() {
        try {
            Image imageAcquireLatestImage = this.mImgRdr.acquireLatestImage();
            this.mImg = imageAcquireLatestImage;
            if (imageAcquireLatestImage == null) {
                android.util.Log.e(TAG, "acquired null image from image reader");
                return null;
            }
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            if (planes.length > 1) {
                return new ImageReaderFormat(this.mImg.getWidth(), this.mImg.getHeight(), planes);
            }
            android.util.Log.e(TAG, "image is not accessable");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static native int on_image(long j, int i);

    public int create(long j, int i, int i2) {
        this.pthis = j;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, 35, 2);
        this.mImgRdr = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(this, null);
        return this.mImgRdr.hashCode();
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.pthis = 0L;
        }
        Image image = this.mImg;
        if (image != null) {
            image.close();
            this.mImg = null;
        }
        this.mImgRdr.setOnImageAvailableListener(null, null);
        this.mImgRdr.close();
        this.mImgRdr = null;
    }

    public ImageReader get() {
        return this.mImgRdr;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        try {
            synchronized (this.mLock) {
                long j = this.pthis;
                if (j != 0) {
                    on_image(j, imageReader.hashCode());
                } else {
                    android.util.Log.d(TAG, "ignore callback:");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
