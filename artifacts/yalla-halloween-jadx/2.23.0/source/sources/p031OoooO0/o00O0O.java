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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
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
    public final ExifInterface f1404OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f1399OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f1400OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f1401OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<String> f1403OooO0o0 = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List<String> f1402OooO0o = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

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
        this.f1404OooO00o = exifInterface;
    }

    public final void OooO00o(@NonNull o00O0O o00o0o2) {
        ArrayList<String> arrayList = new ArrayList(f1403OooO0o0);
        arrayList.removeAll(f1402OooO0o);
        for (String str : arrayList) {
            String strOooO0Oo = this.f1404OooO00o.OooO0Oo(str);
            ExifInterface exifInterface = o00o0o2.f1404OooO00o;
            String strOooO0Oo2 = exifInterface.OooO0Oo(str);
            if (strOooO0Oo != null && !strOooO0Oo.equals(strOooO0Oo2)) {
                exifInterface.Oooo00O(str, strOooO0Oo);
            }
        }
    }

    public final int OooO0O0() {
        switch (this.f1404OooO00o.OooO0o0(0, "Orientation")) {
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
        ExifInterface exifInterface = this.f1404OooO00o;
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

    /* JADX WARN: Code duplicated, block: B:112:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [long] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [OoooO0.o00O0O$OooO0OO, java.lang.ThreadLocal] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.BufferedInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [long] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.exifinterface.media.ExifInterface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0Oo() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        String str;
        ?? r3;
        ?? r2;
        boolean z;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream4;
        BufferedOutputStream bufferedOutputStream2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? bufferedInputStream = f1401OooO0Oo;
        String str2 = ((SimpleDateFormat) bufferedInputStream.get()).format(new Date(jCurrentTimeMillis));
        ?? r5 = this.f1404OooO00o;
        r5.Oooo00O("DateTime", str2);
        try {
            bufferedInputStream = ((SimpleDateFormat) bufferedInputStream.get()).parse(str2).getTime();
            r5.Oooo00O("SubSecTime", Long.toString(jCurrentTimeMillis - bufferedInputStream));
        } catch (ParseException unused) {
        }
        int i = r5.f5709OooO0Oo;
        if (!(i == 4 || i == 13 || i == 14 || i == 3 || i == 0)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats.");
        }
        if (r5.f5707OooO0O0 == null && r5.f5706OooO00o == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (r5.f5713OooO0oo && r5.f5705OooO && !r5.f5714OooOO0) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i2 = r5.f5717OooOOO;
        FileInputStream fileInputStream2 = null;
        String str3 = null;
         = 0;
        ?? r11 = 0;
        FileInputStream fileInputStream3 = null;
        ?? r12 = 0;
        FileOutputStream fileOutputStream5 = null;
        r5.f5718OooOOO0 = (i2 == 6 || i2 == 7) ? r5.OooOOOo() : null;
        try {
            try {
                File fileCreateTempFile = File.createTempFile("temp", "tmp");
                if (r5.f5706OooO00o != null) {
                    fileInputStream = new FileInputStream(r5.f5706OooO00o);
                } else {
                    androidx.exifinterface.media.OooO00o.C0127OooO00o.OooO0OO(r5.f5707OooO0O0, 0L, OsConstants.SEEK_SET);
                    fileInputStream = new FileInputStream(r5.f5707OooO0O0);
                }
                FileInputStream fileInputStream4 = fileInputStream;
                try {
                    FileOutputStream fileOutputStream6 = new FileOutputStream(fileCreateTempFile);
                    try {
                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream4, fileOutputStream6);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream4);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream6);
                        try {
                            try {
                                try {
                                    FileInputStream fileInputStream5 = new FileInputStream(fileCreateTempFile);
                                    try {
                                        if (r5.f5706OooO00o != null) {
                                            fileOutputStream4 = new FileOutputStream(r5.f5706OooO00o);
                                        } else {
                                            androidx.exifinterface.media.OooO00o.C0127OooO00o.OooO0OO(r5.f5707OooO0O0, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream4 = new FileOutputStream(r5.f5707OooO0O0);
                                        }
                                        fileOutputStream2 = fileOutputStream4;
                                        try {
                                            bufferedInputStream = new BufferedInputStream(fileInputStream5);
                                            try {
                                                bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream2);
                                                try {
                                                    int i3 = r5.f5709OooO0Oo;
                                                    if (i3 == 4) {
                                                        r5.OooOooO(bufferedInputStream, bufferedOutputStream2);
                                                    } else if (i3 == 13) {
                                                        r5.OooOooo(bufferedInputStream, bufferedOutputStream2);
                                                    } else if (i3 == 14) {
                                                        r5.Oooo000(bufferedInputStream, bufferedOutputStream2);
                                                    } else if (i3 == 3 || i3 == 0) {
                                                        r5.Oooo0o0(new ExifInterface.OooO0OO(bufferedOutputStream2, ByteOrder.BIG_ENDIAN));
                                                    }
                                                    androidx.exifinterface.media.OooO00o.OooO0O0(bufferedInputStream);
                                                    androidx.exifinterface.media.OooO00o.OooO0O0(bufferedOutputStream2);
                                                    fileCreateTempFile.delete();
                                                    r5.f5718OooOOO0 = null;
                                                } catch (Exception e) {
                                                    e = e;
                                                    r11 = bufferedInputStream;
                                                    bufferedOutputStream = bufferedOutputStream2;
                                                    r2 = r11;
                                                    fileInputStream3 = fileInputStream5;
                                                    r3 = bufferedOutputStream;
                                                    try {
                                                        FileInputStream fileInputStream6 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (r5.f5706OooO00o == null) {
                                                                androidx.exifinterface.media.OooO00o.C0127OooO00o.OooO0OO(r5.f5707OooO0O0, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(r5.f5707OooO0O0);
                                                            } else {
                                                                fileOutputStream3 = new FileOutputStream(r5.f5706OooO00o);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream6, fileOutputStream2);
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream6);
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            fileInputStream3 = fileInputStream6;
                                                            try {
                                                                throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                z = true;
                                                                try {
                                                                    androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream3);
                                                                    androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream2);
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    androidx.exifinterface.media.OooO00o.OooO0O0(r2);
                                                                    androidx.exifinterface.media.OooO00o.OooO0O0(r3);
                                                                    if (!z) {
                                                                        fileCreateTempFile.delete();
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            fileInputStream3 = fileInputStream6;
                                                            z = false;
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream3);
                                                            androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                bufferedOutputStream2 = null;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str = str3;
                                                r12 = bufferedInputStream;
                                                r3 = str;
                                                r2 = r12;
                                                z = false;
                                                androidx.exifinterface.media.OooO00o.OooO0O0(r2);
                                                androidx.exifinterface.media.OooO00o.OooO0O0(r3);
                                                if (!z) {
                                                    fileCreateTempFile.delete();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            bufferedOutputStream = null;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        bufferedOutputStream = null;
                                        fileOutputStream2 = null;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r2 = 0;
                                    r3 = 0;
                                    fileOutputStream2 = null;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                str = null;
                                r3 = str;
                                r2 = r12;
                                z = false;
                                androidx.exifinterface.media.OooO00o.OooO0O0(r2);
                                androidx.exifinterface.media.OooO00o.OooO0O0(r3);
                                if (!z) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str3 = str2;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        fileOutputStream5 = fileOutputStream6;
                        fileOutputStream = fileOutputStream5;
                        fileInputStream2 = fileInputStream4;
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
            androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
            androidx.exifinterface.media.OooO00o.OooO0O0(fileOutputStream);
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
        ExifInterface exifInterface = this.f1404OooO00o;
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
                dOooO0oO = OooO0o2.OooO0oO(exifInterface.f5712OooO0oO);
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
                dOooO0oO2 = OooO0o3.OooO0oO(exifInterface.f5712OooO0oO);
            } catch (NumberFormatException unused3) {
            }
        }
        String strOooO0Oo6 = exifInterface.OooO0Oo("GPSSpeedRef");
        if (strOooO0Oo6 == null) {
            strOooO0Oo6 = "K";
        }
        String strOooO0Oo7 = exifInterface.OooO0Oo("GPSDateStamp");
        String strOooO0Oo8 = exifInterface.OooO0Oo("GPSTimeStamp");
        OooO0OO oooO0OO = f1401OooO0Oo;
        long j2 = -1;
        if (strOooO0Oo7 == null && strOooO0Oo8 == null) {
            j = -1;
        } else {
            try {
                if (strOooO0Oo8 == null) {
                    time = f1399OooO0O0.get().parse(strOooO0Oo7).getTime();
                } else if (strOooO0Oo7 == null) {
                    time = f1400OooO0OO.get().parse(strOooO0Oo8).getTime();
                } else {
                    String strOooO00o = o0OoOo0.OooO00o(strOooO0Oo7, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0Oo8);
                    if (strOooO00o == null) {
                        j = -1;
                    } else {
                        time = oooO0OO.get().parse(strOooO00o).getTime();
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
