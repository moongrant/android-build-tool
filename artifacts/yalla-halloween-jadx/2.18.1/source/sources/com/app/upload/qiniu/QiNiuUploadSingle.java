package com.app.upload.qiniu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Build;
import android.text.TextUtils;
import com.app.impl.UploadSingleCallback;
import com.app.model.UploadModel;
import com.app.upload.Upload;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.storage.KeyGenerator;
import com.qiniu.android.storage.UpCancellationSignal;
import com.qiniu.android.storage.UpCompletionHandler;
import com.qiniu.android.storage.UpProgressHandler;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.storage.UploadOptions;
import com.qiniu.android.storage.persistent.FileRecorder;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p179o00o0.o000oOoO;
import p207o00o0oO.o00O00OO;
import p207o00o0oO.o00O00o0;
import p207o00o0oO.oo00o;

/* JADX INFO: loaded from: classes.dex */
public final class QiNiuUploadSingle {
    private final String TAG = "QiNiuUploadSingle";
    private volatile boolean isCancelled = false;
    private UploadModel mModel;
    private String mToken;
    private UploadManager mUploadManager;
    private UploadSingleCallback mUploadSingleCallback;
    private o000oOoO progressCallback;

    public QiNiuUploadSingle(String str) {
        onInit();
        this.mToken = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onComplete(UploadModel uploadModel, ResponseInfo responseInfo, JSONObject jSONObject) {
        if (responseInfo.isOK()) {
            UploadSingleCallback uploadSingleCallback = this.mUploadSingleCallback;
            if (uploadSingleCallback != null) {
                uploadSingleCallback.result(UploadSingleCallback.State.complete, uploadModel.onComplete());
                return;
            }
            return;
        }
        if (this.mUploadSingleCallback != null) {
            if (TextUtils.equals("cancelled by user", responseInfo.error) || this.isCancelled) {
                this.mUploadSingleCallback.result(UploadSingleCallback.State.cancel, uploadModel.onCancel());
            } else {
                this.mUploadSingleCallback.result(UploadSingleCallback.State.err, uploadModel.onErr());
            }
        }
    }

    private void onInit() {
        try {
            this.mUploadManager = new UploadManager(new Configuration.Builder().useHttps(true).recorder(new FileRecorder(File.createTempFile("QiNiuUpload", ".tmp").getParent()), new KeyGenerator() { // from class: com.app.upload.qiniu.QiNiuUploadSingle.1
                @Override // com.qiniu.android.storage.KeyGenerator
                public String gen(String str, File file) {
                    try {
                        return str + "_._" + ((Object) new StringBuffer(file.getAbsolutePath()).reverse());
                    } catch (Exception e) {
                        e.printStackTrace();
                        return "";
                    }
                }
            }).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public QiNiuUploadSingle addProgressCallback(o000oOoO o000oooo2) {
        this.progressCallback = o000oooo2;
        return this;
    }

    public QiNiuUploadSingle addUploadSingleCallback(UploadSingleCallback uploadSingleCallback) {
        this.mUploadSingleCallback = uploadSingleCallback;
        return this;
    }

    public QiNiuUploadSingle toPauseUpload() {
        this.isCancelled = true;
        return this;
    }

    public QiNiuUploadSingle toUpload(UploadModel uploadModel) {
        return toUpload(uploadModel, true);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:169:0x0293  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:187:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.StringBuilder] */
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
    public QiNiuUploadSingle toUpload(UploadModel uploadModel, boolean z) throws Throwable {
        byte[] bArr;
        UploadSingleCallback uploadSingleCallback;
        int i;
        boolean z2;
        byte[] byteArray;
        Throwable th;
        ?? r3;
        Bitmap bitmapDecodeStream;
        int i2;
        Bitmap bitmapCreateBitmap;
        if (uploadModel == null || TextUtils.isEmpty(uploadModel.getPath()) || TextUtils.isEmpty(uploadModel.getKey()) || TextUtils.isEmpty(this.mToken)) {
            UploadSingleCallback uploadSingleCallback2 = this.mUploadSingleCallback;
            if (uploadSingleCallback2 != null) {
                uploadSingleCallback2.result(UploadSingleCallback.State.err, uploadModel);
            }
            return this;
        }
        this.mModel = uploadModel;
        HashMap map = new HashMap();
        map.put("x:phone", this.mModel.getXPhone());
        String path = this.mModel.getPath();
        Context appContext = Upload.getAppContext();
        Boolean bool = Boolean.FALSE;
        String strOooO0Oo = o00O00o0.OooO0Oo(appContext, path);
        Iterator<String> it = o00O00o0.f33292OooO00o.keySet().iterator();
        while (it.hasNext()) {
            if (strOooO0Oo.indexOf(it.next()) == 0) {
                bool = Boolean.TRUE;
                break;
            }
        }
        boolean zBooleanValue = bool.booleanValue();
        int i3 = 1;
        byte[] bArrOooO0O0 = null;
        str = null;
        String str = null;
        ?? r7 = 0;
        if (zBooleanValue && o00O00o0.OooO0o0(path)) {
            Context appContext2 = Upload.getAppContext();
            try {
                int attributeInt = new ExifInterface(path).getAttributeInt("Orientation", 1);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt != 6) {
                    i = attributeInt != 8 ? 0 : 270;
                } else {
                    i = 90;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i != 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = 4;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                    } catch (OutOfMemoryError unused) {
                        bitmapCreateBitmap = null;
                    }
                    if (bitmapCreateBitmap == null) {
                        bitmapCreateBitmap = bitmapDecodeFile;
                    }
                    if (bitmapDecodeFile != bitmapCreateBitmap) {
                        bitmapDecodeFile.recycle();
                    }
                    path = oo00o.OooO0OO(bitmapCreateBitmap, oo00o.OooO00o(appContext2, path));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                Context appContext3 = Upload.getAppContext();
                try {
                    z2 = new File(path).exists();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (z2) {
                    String str2 = o00O00o0.f33292OooO00o.get(o00O00o0.OooO0Oo(appContext3, path));
                    if (!TextUtils.isEmpty(str2) && "gif".equals(str2.toLowerCase())) {
                        byteArray = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        try {
                            options2.inJustDecodeBounds = true;
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 29) {
                                BitmapFactory.decodeStream(appContext3.getContentResolver().openInputStream(o00O00OO.OooO00o(appContext3, path)), null, options2);
                            } else {
                                BitmapFactory.decodeFile(path, options2);
                            }
                            int i5 = options2.outHeight;
                            int i6 = options2.outWidth;
                            if ((i5 > 1920 || i6 > 1080) && (i3 = i5 / 1920) <= (i2 = i6 / 1080)) {
                                i3 = i2;
                            }
                            BitmapFactory.Options options3 = new BitmapFactory.Options();
                            try {
                                options3.inSampleSize = i3;
                                options3.inJustDecodeBounds = false;
                                bitmapDecodeStream = i4 >= 29 ? BitmapFactory.decodeStream(appContext3.getContentResolver().openInputStream(o00O00OO.OooO00o(appContext3, path)), null, options3) : BitmapFactory.decodeFile(path, options3);
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                bitmapDecodeStream = null;
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            bitmapDecodeStream = null;
                        }
                        if (bitmapDecodeStream != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                int i7 = 100;
                                bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                while ((byteArrayOutputStream.size() * 1.224018f) / 1024.0f > 480 / 2.0f) {
                                    byteArrayOutputStream.reset();
                                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
                                    i7 -= 10;
                                    if (i7 <= 0) {
                                        break;
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e6) {
                                    e = e6;
                                    e.printStackTrace();
                                } catch (Exception e7) {
                                    e = e7;
                                    e.printStackTrace();
                                }
                            } catch (IOException e8) {
                                e = e8;
                                byteArray = null;
                            } catch (Exception e9) {
                                e = e9;
                                byteArray = null;
                            }
                            bitmapDecodeStream.recycle();
                        } else {
                            byteArray = null;
                        }
                    }
                } else {
                    byteArray = null;
                }
                UploadModel uploadModel2 = this.mModel;
                String path2 = Upload.getAndroidData().getPath();
                ?? sb = new StringBuilder();
                ?? HashCode = uploadModel.getPath().hashCode();
                sb.append(HashCode);
                sb.append(o00O00o0.OooO0OO(uploadModel.getPath()));
                ?? string = sb.toString();
                try {
                    try {
                        File file = new File(path2);
                        if (!file.exists() && file.isDirectory()) {
                            file.mkdirs();
                        }
                        File file2 = new File(path2 + File.separator + string);
                        string = new FileOutputStream(file2);
                        try {
                            HashCode = new BufferedOutputStream(string);
                            try {
                                HashCode.write(byteArray);
                                String path3 = file2.getPath();
                                try {
                                    HashCode.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                                str = path3;
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                if (HashCode != 0) {
                                    try {
                                        HashCode.close();
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                    }
                                }
                                if (string != 0) {
                                }
                                uploadModel2.setCompressPath(str);
                                bArrOooO0O0 = byteArray;
                                if (bArrOooO0O0 == null) {
                                    bArrOooO0O0 = o00O00o0.OooO0O0(Upload.getAppContext(), this.mModel.getPath());
                                }
                                bArr = bArrOooO0O0;
                                if (bArr == null) {
                                }
                                uploadSingleCallback = this.mUploadSingleCallback;
                                if (uploadSingleCallback != null) {
                                    uploadSingleCallback.result(UploadSingleCallback.State.err, this.mModel);
                                }
                                return this;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            HashCode = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            HashCode = 0;
                            ?? r8 = string;
                            th = th;
                            r3 = r8;
                            r7 = HashCode;
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            if (r3 != 0) {
                                throw th;
                            }
                            try {
                                r3.close();
                                throw th;
                            } catch (IOException e15) {
                                e15.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e16) {
                    e = e16;
                    string = 0;
                    HashCode = 0;
                } catch (Throwable th4) {
                    th = th4;
                    r3 = 0;
                    if (r7 != 0) {
                        r7.close();
                    }
                    if (r3 != 0) {
                        throw th;
                    }
                    r3.close();
                    throw th;
                }
                try {
                    string.close();
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
                uploadModel2.setCompressPath(str);
                bArrOooO0O0 = byteArray;
            } else {
                bArrOooO0O0 = o00O00o0.OooO0O0(Upload.getAppContext(), path);
            }
        }
        if (bArrOooO0O0 == null) {
            bArrOooO0O0 = o00O00o0.OooO0O0(Upload.getAppContext(), this.mModel.getPath());
        }
        bArr = bArrOooO0O0;
        if (bArr == null && this.mUploadManager != null) {
            this.isCancelled = false;
            this.mUploadManager.put(bArr, this.mModel.getKey(), this.mToken, new UpCompletionHandler() { // from class: com.app.upload.qiniu.QiNiuUploadSingle.2
                @Override // com.qiniu.android.storage.UpCompletionHandler
                public void complete(String str3, ResponseInfo responseInfo, JSONObject jSONObject) {
                    QiNiuUploadSingle qiNiuUploadSingle = QiNiuUploadSingle.this;
                    qiNiuUploadSingle.onComplete(qiNiuUploadSingle.mModel, responseInfo, jSONObject);
                }
            }, new UploadOptions(map, null, false, new UpProgressHandler() { // from class: com.app.upload.qiniu.QiNiuUploadSingle.3
                @Override // com.qiniu.android.storage.UpProgressHandler
                public void progress(String str3, double d) {
                    if (QiNiuUploadSingle.this.progressCallback != null) {
                        QiNiuUploadSingle.this.progressCallback.progress((int) (d * 1000.0d));
                    }
                }
            }, new UpCancellationSignal() { // from class: com.app.upload.qiniu.QiNiuUploadSingle.4
                @Override // com.qiniu.android.http.CancellationHandler
                public boolean isCancelled() {
                    return QiNiuUploadSingle.this.isCancelled;
                }
            }));
            return this;
        }
        uploadSingleCallback = this.mUploadSingleCallback;
        if (uploadSingleCallback != null) {
            uploadSingleCallback.result(UploadSingleCallback.State.err, this.mModel);
        }
        return this;
    }
}
