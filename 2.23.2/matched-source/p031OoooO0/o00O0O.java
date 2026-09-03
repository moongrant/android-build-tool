package p031OoooO0;

import android.location.Location;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExifInterface f1375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f1370OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f1371OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f1372OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<String> f1374OooO0o0 = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List<String> f1373OooO0o = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    public class OooO00o extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class OooO0O0 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class OooO0OO extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public o00O0O(ExifInterface exifInterface) {
        this.f1375OooO00o = exifInterface;
    }

    public final void OooO00o(@NonNull o00O0O o00o0o2) {
        ArrayList<String> arrayList = new ArrayList(f1374OooO0o0);
        arrayList.removeAll(f1373OooO0o);
        for (String str : arrayList) {
            String strOooO0Oo = this.f1375OooO00o.OooO0Oo(str);
            ExifInterface exifInterface = o00o0o2.f1375OooO00o;
            String strOooO0Oo2 = exifInterface.OooO0Oo(str);
            if (strOooO0Oo != null && !strOooO0Oo.equals(strOooO0Oo2)) {
                exifInterface.Oooo00O(str, strOooO0Oo);
            }
        }
    }

    public final int OooO0O0() {
        switch (this.f1375OooO00o.OooO0o0(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public final void OooO0OO(int i) {
        int i2 = i % 90;
        ExifInterface exifInterface = this.f1375OooO00o;
        if (i2 != 0) {
            o00O0O0.OooO0oo("o00O0O", String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i)));
            exifInterface.Oooo00O("Orientation", String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int iOooO0o0 = exifInterface.OooO0o0(0, "Orientation");
        while (i3 < 0) {
            i3 += 90;
            switch (iOooO0o0) {
                case 2:
                    iOooO0o0 = 5;
                    break;
                case 3:
                case 8:
                    iOooO0o0 = 6;
                    break;
                case 4:
                    iOooO0o0 = 7;
                    break;
                case 5:
                    iOooO0o0 = 4;
                    break;
                case 6:
                    iOooO0o0 = 1;
                    break;
                case 7:
                    iOooO0o0 = 2;
                    break;
                default:
                    iOooO0o0 = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (iOooO0o0) {
                case 2:
                    iOooO0o0 = 7;
                    break;
                case 3:
                    iOooO0o0 = 8;
                    break;
                case 4:
                    iOooO0o0 = 5;
                    break;
                case 5:
                    iOooO0o0 = 2;
                    break;
                case 6:
                    iOooO0o0 = 3;
                    break;
                case 7:
                    iOooO0o0 = 4;
                    break;
                case 8:
                    iOooO0o0 = 1;
                    break;
                default:
                    iOooO0o0 = 6;
                    break;
            }
        }
        exifInterface.Oooo00O("Orientation", String.valueOf(iOooO0o0));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129 A[Catch: all -> 0x0155, Exception -> 0x0158, TryCatch #21 {Exception -> 0x0158, all -> 0x0155, blocks: (B:83:0x0125, B:85:0x0129, B:87:0x013f, B:86:0x0138), top: B:149:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0138 A[Catch: all -> 0x0155, Exception -> 0x0158, TryCatch #21 {Exception -> 0x0158, all -> 0x0155, blocks: (B:83:0x0125, B:85:0x0129, B:87:0x013f, B:86:0x0138), top: B:149:0x0125 }] */
    public final void OooO0Oo() throws Throwable {
        Closeable closeable;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        boolean z;
        BufferedOutputStream bufferedOutputStream2;
        boolean z2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        OooO0OO oooO0OO = f1372OooO0Oo;
        String str = oooO0OO.get().format(new Date(jCurrentTimeMillis));
        ExifInterface exifInterface = this.f1375OooO00o;
        exifInterface.Oooo00O("DateTime", str);
        try {
            exifInterface.Oooo00O("SubSecTime", Long.toString(jCurrentTimeMillis - oooO0OO.get().parse(str).getTime()));
        } catch (ParseException unused) {
        }
        int i = exifInterface.f5723OooO0Oo;
        if (!(i == 4 || i == 13 || i == 14)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (exifInterface.f5721OooO0O0 == null && exifInterface.f5720OooO00o == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (exifInterface.f5727OooO0oo && exifInterface.f5719OooO && !exifInterface.f5728OooOO0) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i2 = exifInterface.f5731OooOOO;
        Closeable closeable2 = null;
        exifInterface.f5732OooOOO0 = (i2 == 6 || i2 == 7) ? exifInterface.OooOOOo() : null;
        try {
            try {
                File fileCreateTempFile = File.createTempFile("temp", "tmp");
                if (exifInterface.f5720OooO00o != null) {
                    fileInputStream = new FileInputStream(exifInterface.f5720OooO00o);
                } else {
                    androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(exifInterface.f5721OooO0O0, 0L, OsConstants.SEEK_SET);
                    fileInputStream = new FileInputStream(exifInterface.f5721OooO0O0);
                }
                FileInputStream fileInputStream3 = fileInputStream;
                try {
                    FileOutputStream fileOutputStream5 = new FileOutputStream(fileCreateTempFile);
                    try {
                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream3, fileOutputStream5);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream3);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream5);
                        try {
                            try {
                                FileInputStream fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (exifInterface.f5720OooO00o != null) {
                                        fileOutputStream4 = new FileOutputStream(exifInterface.f5720OooO00o);
                                    } else {
                                        androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(exifInterface.f5721OooO0O0, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(exifInterface.f5721OooO0O0);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream4);
                                        try {
                                            bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i3 = exifInterface.f5723OooO0Oo;
                                                if (i3 == 4) {
                                                    exifInterface.OooOooO(bufferedInputStream, bufferedOutputStream2);
                                                } else if (i3 == 13) {
                                                    exifInterface.OooOooo(bufferedInputStream, bufferedOutputStream2);
                                                } else if (i3 == 14) {
                                                    exifInterface.Oooo000(bufferedInputStream, bufferedOutputStream2);
                                                }
                                                androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                                androidx.exifinterface.media.OooO00o.OooO0O0(bufferedOutputStream2);
                                                fileCreateTempFile.delete();
                                                exifInterface.f5732OooOOO0 = null;
                                            } catch (Exception e) {
                                                e = e;
                                                bufferedOutputStream = bufferedOutputStream2;
                                                fileOutputStream = fileOutputStream3;
                                                closeable2 = fileInputStream4;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (exifInterface.f5720OooO00o == null) {
                                                            androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(exifInterface.f5721OooO0O0, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream2 = new FileOutputStream(exifInterface.f5721OooO0O0);
                                                        } else {
                                                            fileOutputStream2 = new FileOutputStream(exifInterface.f5720OooO00o);
                                                        }
                                                        fileOutputStream = fileOutputStream2;
                                                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream2, fileOutputStream);
                                                        try {
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bufferedOutputStream2 = bufferedOutputStream;
                                                            closeable2 = bufferedOutputStream2;
                                                            z = false;
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                                            if (!z) {
                                                                fileCreateTempFile.delete();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        closeable2 = fileInputStream2;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            z2 = true;
                                                            try {
                                                                androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                                                androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
                                                                throw th;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                closeable2 = bufferedOutputStream;
                                                                z = z2;
                                                                androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                                                androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                                                if (!z) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        closeable2 = fileInputStream2;
                                                        z2 = false;
                                                        androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                                        androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                closeable2 = bufferedOutputStream2;
                                                z = false;
                                                androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                                androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                                if (!z) {
                                                    fileCreateTempFile.delete();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            bufferedOutputStream2 = null;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z = false;
                                            androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                            androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                                            if (!z) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        bufferedOutputStream2 = null;
                                        bufferedInputStream = null;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        fileOutputStream = fileOutputStream3;
                                        closeable2 = fileInputStream4;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (exifInterface.f5720OooO00o == null) {
                                            androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(exifInterface.f5721OooO0O0, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream2 = new FileOutputStream(exifInterface.f5721OooO0O0);
                                        } else {
                                            fileOutputStream2 = new FileOutputStream(exifInterface.f5720OooO00o);
                                        }
                                        fileOutputStream = fileOutputStream2;
                                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream2, fileOutputStream);
                                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                                        androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream3 = null;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                fileOutputStream = null;
                                bufferedOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th9) {
                        th = th9;
                        closeable2 = fileOutputStream5;
                        closeable = closeable2;
                        closeable2 = fileInputStream3;
                        androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
                        androidx.exifinterface.media.OooO00o.OooO0O0(closeable);
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th11) {
            th = th11;
            closeable = null;
            androidx.exifinterface.media.OooO00o.OooO0O0(closeable2);
            androidx.exifinterface.media.OooO00o.OooO0O0(closeable);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    public final String toString() {
        double[] dArr;
        double d;
        long time;
        long j;
        char c;
        Location location;
        byte b;
        long time2;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[8];
        ExifInterface exifInterface = this.f1375OooO00o;
        objArr[0] = Integer.valueOf(exifInterface.OooO0o0(0, "ImageWidth"));
        objArr[1] = Integer.valueOf(exifInterface.OooO0o0(0, "ImageLength"));
        objArr[2] = Integer.valueOf(OooO0O0());
        int iOooO0o0 = exifInterface.OooO0o0(0, "Orientation");
        objArr[3] = Boolean.valueOf(iOooO0o0 == 4 || iOooO0o0 == 5 || iOooO0o0 == 7);
        objArr[4] = Boolean.valueOf(exifInterface.OooO0o0(0, "Orientation") == 2);
        String strOooO0Oo = exifInterface.OooO0Oo("GPSProcessingMethod");
        String strOooO0Oo2 = exifInterface.OooO0Oo("GPSLatitude");
        String strOooO0Oo3 = exifInterface.OooO0Oo("GPSLatitudeRef");
        String strOooO0Oo4 = exifInterface.OooO0Oo("GPSLongitude");
        String strOooO0Oo5 = exifInterface.OooO0Oo("GPSLongitudeRef");
        if (strOooO0Oo2 == null || strOooO0Oo3 == null || strOooO0Oo4 == null || strOooO0Oo5 == null) {
            dArr = null;
        } else {
            try {
                dArr = new double[]{ExifInterface.OooO0O0(strOooO0Oo2, strOooO0Oo3), ExifInterface.OooO0O0(strOooO0Oo4, strOooO0Oo5)};
            } catch (IllegalArgumentException unused) {
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strOooO0Oo2, strOooO0Oo3, strOooO0Oo4, strOooO0Oo5));
                dArr = null;
            }
        }
        ExifInterface.OooO0o OooO0o2 = exifInterface.OooO0o("GPSAltitude");
        double dOooO0oO = -1.0d;
        if (OooO0o2 != null) {
            try {
                dOooO0oO = OooO0o2.OooO0oO(exifInterface.f5726OooO0oO);
            } catch (NumberFormatException unused2) {
            }
        }
        int iOooO0o1 = exifInterface.OooO0o0(-1, "GPSAltitudeRef");
        double dOooO0oO2 = 0.0d;
        if (dOooO0oO < 0.0d || iOooO0o1 < 0) {
            d = 0.0d;
        } else {
            d = dOooO0oO * ((double) (iOooO0o1 == 1 ? -1 : 1));
        }
        ExifInterface.OooO0o OooO0o3 = exifInterface.OooO0o("GPSSpeed");
        if (OooO0o3 != null) {
            try {
                dOooO0oO2 = OooO0o3.OooO0oO(exifInterface.f5726OooO0oO);
            } catch (NumberFormatException unused3) {
            }
        }
        String strOooO0Oo6 = exifInterface.OooO0Oo("GPSSpeedRef");
        if (strOooO0Oo6 == null) {
            strOooO0Oo6 = "K";
        }
        String strOooO0Oo7 = exifInterface.OooO0Oo("GPSDateStamp");
        String strOooO0Oo8 = exifInterface.OooO0Oo("GPSTimeStamp");
        OooO0OO oooO0OO = f1372OooO0Oo;
        long j2 = -1;
        if (strOooO0Oo7 == null && strOooO0Oo8 == null) {
            j = -1;
        } else {
            try {
                if (strOooO0Oo8 == null) {
                    time = f1370OooO0O0.get().parse(strOooO0Oo7).getTime();
                } else if (strOooO0Oo7 == null) {
                    time = f1371OooO0OO.get().parse(strOooO0Oo8).getTime();
                } else {
                    String strOooO0O0 = o0OoOo0.OooO0O0(strOooO0Oo7, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0Oo8);
                    if (strOooO0O0 == null) {
                        j = -1;
                    } else {
                        time = oooO0OO.get().parse(strOooO0O0).getTime();
                    }
                }
                j = time;
            } catch (ParseException unused4) {
            }
        }
        if (dArr == null) {
            c = 5;
            location = null;
        } else {
            if (strOooO0Oo == null) {
                strOooO0Oo = "o00O0O";
            }
            Location location2 = new Location(strOooO0Oo);
            location2.setLatitude(dArr[0]);
            location2.setLongitude(dArr[1]);
            if (d != 0.0d) {
                location2.setAltitude(d);
            }
            if (dOooO0oO2 != 0.0d) {
                int iHashCode = strOooO0Oo6.hashCode();
                if (iHashCode != 75) {
                    if (iHashCode != 77) {
                        if (iHashCode == 78 && strOooO0Oo6.equals("N")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strOooO0Oo6.equals("M")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strOooO0Oo6.equals("K")) {
                    b = 2;
                } else {
                    b = -1;
                }
                if (b != 0) {
                    dOooO0oO2 *= b != 1 ? 0.621371d : 1.15078d;
                }
                location2.setSpeed((float) (dOooO0oO2 / 2.23694d));
            }
            if (j != -1) {
                location2.setTime(j);
            }
            c = 5;
            location = location2;
        }
        objArr[c] = location;
        String strOooO0Oo9 = exifInterface.OooO0Oo("DateTimeOriginal");
        if (strOooO0Oo9 == null) {
            time2 = -1;
        } else {
            try {
                time2 = oooO0OO.get().parse(strOooO0Oo9).getTime();
            } catch (ParseException unused5) {
                time2 = -1;
            }
        }
        if (time2 != -1) {
            String strOooO0Oo10 = exifInterface.OooO0Oo("SubSecTimeOriginal");
            if (strOooO0Oo10 != null) {
                try {
                    long j3 = Long.parseLong(strOooO0Oo10);
                    while (j3 > 1000) {
                        j3 /= 10;
                    }
                    time2 += j3;
                } catch (NumberFormatException unused6) {
                }
            }
            j2 = time2;
        }
        objArr[6] = Long.valueOf(j2);
        objArr[7] = exifInterface.OooO0Oo("ImageDescription");
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", objArr);
    }
}
