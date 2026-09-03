package com.common.support.apm.netdiag;

import android.content.Context;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.configuration.specific.NetDialogConfig;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.convertor.SysServerConvertor;
import com.common.support.okhttpforsdk.BaseApi;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o00Oo00;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/common/support/apm/netdiag/NetSpeedServiceImpl;", "Lcom/common/support/okhttpforsdk/BaseApi;", "Lcom/common/support/apm/netdiag/NetService;", "", "url", "Lkotlin/Pair;", "parseBaseUrlAndPath", "name", "Ljava/io/File;", "createTempFile", "", "uploadSpeed", "downloadSpeed", "publicIpAddress", "defaultDomain", "Ljava/lang/String;", "cacheFile", "Ljava/io/File;", "kotlin.jvm.PlatformType", "cacheDir", "Landroid/content/Context;", "context", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "<init>", "(Landroid/content/Context;Lo0ooO0oO/o00OOOO0;Ljava/lang/String;)V", "Companion", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class NetSpeedServiceImpl extends BaseApi implements NetService {

    @NotNull
    private static final String CACHE_FILE_NAME = "netDiag.cache";

    @NotNull
    private static final String PATH_DOWNSTREAM = "sailfish_sysservice/net/v1.0/downstream";

    @NotNull
    private static final String PATH_IP = "sailfish_sysservice/net/v1.0/getip";

    @NotNull
    private static final String PATH_UPSTREAM = "sailfish_sysservice/net/v1.0/upstream";
    private String cacheDir;

    @Nullable
    private File cacheFile;

    @NotNull
    private final String defaultDomain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetSpeedServiceImpl(@NotNull Context context, @NotNull o00OOOO0 okHttpClient, @NotNull String defaultDomain) {
        super(okHttpClient, defaultDomain, new SysServerConvertor(), null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(defaultDomain, "defaultDomain");
        this.defaultDomain = defaultDomain;
        this.cacheDir = context.getCacheDir().getPath();
        File file = new File(this.cacheDir + ((Object) File.separator) + CACHE_FILE_NAME);
        if (file.exists() && file.isFile() && file.length() > 0) {
            this.cacheFile = file;
        }
    }

    private final File createTempFile(String name) throws IOException {
        File file = new File(this.cacheDir, name);
        file.createNewFile();
        return file;
    }

    private final Pair<String, String> parseBaseUrlAndPath(String url) {
        try {
            Intrinsics.checkNotNullParameter(url, "<this>");
            o00OO.OooO00o oooO00o = new o00OO.OooO00o();
            oooO00o.OooO0oO(null, url);
            o00OO o00ooOooO0OO = oooO00o.OooO0OO();
            return new Pair<>(o00ooOooO0OO.f57203OooO00o + "://" + o00ooOooO0OO.f57206OooO0Oo + ':' + o00ooOooO0OO.f57208OooO0o0, o00ooOooO0OO.OooO0O0());
        } catch (Throwable th) {
            LoggerKt.logE(LoggerKt.DEFAULT_LOG_TAG, th, new Function0<String>() { // from class: com.common.support.apm.netdiag.NetSpeedServiceImpl.parseBaseUrlAndPath.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Download url parse failed!";
                }
            });
            return new Pair<>("", "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.common.support.apm.netdiag.NetService
    public float downloadSpeed() throws IOException {
        String strComponent2;
        FileOutputStream fileOutputStream;
        float fCurrentTimeMillis;
        String strDownStreamUrl = NetDialogConfig.INSTANCE.downStreamUrl();
        if ((strDownStreamUrl.length() == 0) == true) {
            setBaseUrl(this.defaultDomain);
            strComponent2 = PATH_DOWNSTREAM;
        } else {
            Pair<String, String> baseUrlAndPath = parseBaseUrlAndPath(strDownStreamUrl);
            String strComponent1 = baseUrlAndPath.component1();
            strComponent2 = baseUrlAndPath.component2();
            if ((strComponent1 == null || strComponent1.length() == 0) == true) {
                strComponent2 = "";
            } else {
                if ((strComponent2 == null || strComponent2.length() == 0) == true) {
                    strComponent2 = "";
                } else {
                    setBaseUrl(strComponent1);
                }
            }
        }
        if (strComponent2.length() == 0) {
            return -1.0f;
        }
        oO0Oo0oo oo0oo0ooOooO0O0 = getOkHttpClient().OooO0O0(get(strComponent2, new Pair[0]));
        File fileCreateTempFile = createTempFile("netDiag.cache_");
        long length = 0;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            o0oOOo o0ooooExecute = FirebasePerfOkHttpClient.execute(oo0oo0ooOooO0O0);
            o0O0o o0o0o = o0ooooExecute.f57347OooOO0;
            InputStream inputStreamO0000OoO = o0o0o == null ? null : o0o0o.OooOOo0().o0000OoO();
            try {
                if (fileCreateTempFile.exists()) {
                    fileCreateTempFile.delete();
                }
                fileCreateTempFile.createNewFile();
                FileOutputStream fileOutputStream3 = new FileOutputStream(fileCreateTempFile);
                try {
                    o0O0o o0o0o2 = o0ooooExecute.f57347OooOO0;
                    long jOooO0OO = o0o0o2 == null ? 0L : o0o0o2.OooO0OO();
                    if (inputStreamO0000OoO != null && jOooO0OO > 0) {
                        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                        while (true) {
                            int i = inputStreamO0000OoO.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, i);
                        }
                        fileOutputStream3.flush();
                    }
                    File file = new File(this.cacheDir, CACHE_FILE_NAME);
                    if (file.exists()) {
                        file.delete();
                    }
                    length = fileCreateTempFile.length();
                    File file2 = new File(this.cacheDir, CACHE_FILE_NAME);
                    fileCreateTempFile.renameTo(file2);
                    this.cacheFile = file2;
                    fCurrentTimeMillis = (System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f;
                    if (inputStreamO0000OoO != null) {
                        inputStreamO0000OoO.close();
                    }
                    fileOutputStream3.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                    inputStream = inputStreamO0000OoO;
                    try {
                        LoggerKt.logE(LoggerKt.DEFAULT_LOG_TAG, th, new Function0<String>() { // from class: com.common.support.apm.netdiag.NetSpeedServiceImpl.downloadSpeed.1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Download Speed test failed!";
                            }
                        });
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        fCurrentTimeMillis = 0.0f;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        if (fCurrentTimeMillis > 0.0f) {
            return length / fCurrentTimeMillis;
        }
        return -1.0f;
    }

    @Override // com.common.support.apm.netdiag.NetService
    @Nullable
    public String publicIpAddress() {
        IPAddress iPAddress;
        o00OOOOo o00ooooo2 = get(PATH_IP, new Pair[0]);
        Type respType = new TypeToken<BaseServerResponse<IPAddress>>() { // from class: com.common.support.apm.netdiag.NetSpeedServiceImpl$publicIpAddress$respType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        BaseServerResponse baseServerResponse = (BaseServerResponse) BaseApi.sync$default(this, o00ooooo2, respType, null, 4, null);
        if (baseServerResponse == null || (iPAddress = (IPAddress) baseServerResponse.getData()) == null) {
            return null;
        }
        return iPAddress.getIp();
    }

    @Override // com.common.support.apm.netdiag.NetService
    public float uploadSpeed() {
        setBaseUrl(this.defaultDomain);
        File file = this.cacheFile;
        if (file == null) {
            return -1.0f;
        }
        oo00oO.Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        o00OOO0O.OooO0OO part = o00OOO0O.OooO0OO.OooO00o.OooO0O0(ShareInternalUtility.STAGING_PARAM, "netDiag", new o00Oo00(file, null));
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        ByteString byteString = ByteString.f60866OooO0oO;
        ByteString byteStringOooO0OO = ByteString.OooO00o.OooO0OO(boundary);
        o00OOO0 o00ooo1 = o00OOO0O.f57241OooO0o0;
        ArrayList arrayList = new ArrayList();
        o00OOO0 type = o00OOO0O.f57240OooO0o;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.areEqual(type.f57236OooO0O0, "multipart")) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("multipart != ", type).toString());
        }
        Intrinsics.checkNotNullParameter(part, "part");
        arrayList.add(part);
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
        o00OOOOo o00oooooPost = post(PATH_UPSTREAM, new o00OOO0O(byteStringOooO0OO, type, o0O000o0.OooOo(arrayList)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Type respType = new TypeToken<BaseServerResponse<Unit>>() { // from class: com.common.support.apm.netdiag.NetSpeedServiceImpl$uploadSpeed$1$respType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        BaseServerResponse baseServerResponse = (BaseServerResponse) BaseApi.sync$default(this, o00oooooPost, respType, null, 4, null);
        float fCurrentTimeMillis = (System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f;
        if (baseServerResponse == null || !baseServerResponse.getSuccess() || fCurrentTimeMillis <= 0.0f) {
            return -1.0f;
        }
        File file2 = this.cacheFile;
        Intrinsics.checkNotNull(file2);
        return file2.length() / fCurrentTimeMillis;
    }
}
