package com.common.support.zeus;

import android.content.Context;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.foundation.layout.oo000o;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.nio.charset.Charset;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001eJY\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0!2\b\b\u0002\u0010\"\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010#J+\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ+\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ3\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010&J3\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u001e\u0010(\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¨\u0006+"}, d2 = {"Lcom/common/support/zeus/Zeus;", "", "()V", "aesEncrypt", "Lcom/common/support/zeus/ZeusEntity;", "data", "", "postBody", "timestamp", "", "([B[BLjava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", RemoteConfigConstants$RequestFieldKey.APP_ID, "generateHera", "generatorZeus", "sign", "signAlgorithmIndex", "", "init", "", "context", "Landroid/content/Context;", "appKey", "parseZeus", "Lcom/common/support/zeus/Zeus$ZeusField;", "zeus", "shieldOnly", "securityCheckResult", "([BLjava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", "algorithmIndex", "algorithmMethod", "Lkotlin/Function2;", "hera", "([BILkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/Long;[B)Lcom/common/support/zeus/ZeusEntity;", "signWithHmac", "signWithHmacAndEnableShield", "([B[B[BLjava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/common/support/zeus/ZeusEntity;", "verifySign", "", "ZeusField", "signv2_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Zeus {

    @NotNull
    public static final Zeus INSTANCE = new Zeus();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/common/support/zeus/Zeus$ZeusField;", "", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "", "al", "", "sign", "(Ljava/lang/String;ILjava/lang/String;)V", "getAl", "()I", "getSign", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "signv2_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ZeusField {
        private final int al;

        @NotNull
        private final String sign;

        @NotNull
        private final String version;

        public ZeusField(@NotNull String version, int i, @NotNull String sign) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(sign, "sign");
            this.version = version;
            this.al = i;
            this.sign = sign;
        }

        public static /* synthetic */ ZeusField copy$default(ZeusField zeusField, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = zeusField.version;
            }
            if ((i2 & 2) != 0) {
                i = zeusField.al;
            }
            if ((i2 & 4) != 0) {
                str2 = zeusField.sign;
            }
            return zeusField.copy(str, i, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getAl() {
            return this.al;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSign() {
            return this.sign;
        }

        @NotNull
        public final ZeusField copy(@NotNull String version, int al, @NotNull String sign) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new ZeusField(version, al, sign);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeusField)) {
                return false;
            }
            ZeusField zeusField = (ZeusField) other;
            return Intrinsics.areEqual(this.version, zeusField.version) && this.al == zeusField.al && Intrinsics.areEqual(this.sign, zeusField.sign);
        }

        public final int getAl() {
            return this.al;
        }

        @NotNull
        public final String getSign() {
            return this.sign;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.sign.hashCode() + (((this.version.hashCode() * 31) + this.al) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ZeusField(version=");
            sb.append(this.version);
            sb.append(", al=");
            sb.append(this.al);
            sb.append(", sign=");
            return oo000o.OooO00o(sb, this.sign, ')');
        }
    }

    /* JADX INFO: renamed from: com.common.support.zeus.Zeus$aesEncrypt$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<byte[], String, String> {
        public AnonymousClass1(Object obj) {
            super(2, obj, SV2.class, "a2", "a2([BLjava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull byte[] p0, @NotNull String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((SV2) this.receiver).a2(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.common.support.zeus.Zeus$aesEncrypt$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<byte[], String, String> {
        public AnonymousClass2(Object obj) {
            super(2, obj, SV2.class, "a2", "a2([BLjava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull byte[] p0, @NotNull String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((SV2) this.receiver).a2(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.common.support.zeus.Zeus$signWithHmac$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class C09071 extends FunctionReferenceImpl implements Function2<byte[], String, String> {
        public C09071(Object obj) {
            super(2, obj, SV2.class, "a3", "a3([BLjava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull byte[] p0, @NotNull String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((SV2) this.receiver).a3(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.common.support.zeus.Zeus$signWithHmac$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class C09082 extends FunctionReferenceImpl implements Function2<byte[], String, String> {
        public C09082(Object obj) {
            super(2, obj, SV2.class, "a3", "a3([BLjava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull byte[] p0, @NotNull String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((SV2) this.receiver).a3(p0, p1);
        }
    }

    private Zeus() {
    }

    public static /* synthetic */ ZeusEntity aesEncrypt$default(Zeus zeus, String str, String str2, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return zeus.aesEncrypt(str, str2, l);
    }

    private final String generateHera() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt.OooOoO(string, "-", "");
    }

    private final String generatorZeus(String sign, int signAlgorithmIndex) {
        return "2.0_" + signAlgorithmIndex + '_' + sign;
    }

    private final ZeusField parseZeus(String zeus) {
        Integer intOrNull;
        List listSplit$default = StringsKt__StringsKt.split$default(zeus, new String[]{"_"}, false, 3, 2, (Object) null);
        if (listSplit$default.size() >= 3 && (intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(1))) != null) {
            return new ZeusField((String) listSplit$default.get(0), intOrNull.intValue(), (String) listSplit$default.get(2));
        }
        return null;
    }

    public static /* synthetic */ ZeusEntity shieldOnly$default(Zeus zeus, String str, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return zeus.shieldOnly(str, l);
    }

    private final ZeusEntity sign(byte[] data, int algorithmIndex, Function2<? super byte[], ? super String, String> algorithmMethod, String hera, Long timestamp, byte[] postBody) {
        ZeusEntity zeusEntity = new ZeusEntity(generatorZeus(algorithmMethod.invoke(data, hera), algorithmIndex), hera, timestamp != null ? timestamp.longValue() : System.currentTimeMillis(), null, 8, null);
        if (postBody != null) {
            zeusEntity.setEncryptedPostBody$signv2_release(SV2.INSTANCE.a1(postBody, hera));
        }
        return zeusEntity;
    }

    public static /* synthetic */ ZeusEntity sign$default(Zeus zeus, byte[] bArr, int i, Function2 function2, String str, Long l, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = zeus.generateHera();
        }
        return zeus.sign(bArr, i, function2, str, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : bArr2);
    }

    public static /* synthetic */ ZeusEntity signWithHmac$default(Zeus zeus, String str, String str2, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return zeus.signWithHmac(str, str2, l);
    }

    public static /* synthetic */ ZeusEntity signWithHmacAndEnableShield$default(Zeus zeus, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return zeus.signWithHmacAndEnableShield(str, str2, str3, l);
    }

    @NotNull
    public final ZeusEntity aesEncrypt(@NotNull String data, @Nullable String postBody, @Nullable Long timestamp) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = data.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(SV2.INSTANCE);
        if (postBody != null) {
            byte[] bytes2 = postBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            bArr = bytes2;
        } else {
            bArr = null;
        }
        return sign$default(this, bytes, 1, anonymousClass1, null, timestamp, bArr, 8, null);
    }

    @NotNull
    public final String appId() {
        return SV2.INSTANCE.a5();
    }

    public final void init(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        SV2.INSTANCE.init(context, appKey);
    }

    @NotNull
    public final ZeusEntity shieldOnly(@NotNull String securityCheckResult, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(securityCheckResult, "securityCheckResult");
        byte[] bytes = securityCheckResult.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return shieldOnly(bytes, timestamp);
    }

    @NotNull
    public final ZeusEntity signWithHmac(@NotNull String data, @Nullable String postBody, @Nullable Long timestamp) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = data.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        C09071 c09071 = new C09071(SV2.INSTANCE);
        if (postBody != null) {
            byte[] bytes2 = postBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            bArr = bytes2;
        } else {
            bArr = null;
        }
        return sign$default(this, bytes, 2, c09071, null, timestamp, bArr, 8, null);
    }

    @NotNull
    public final ZeusEntity signWithHmacAndEnableShield(@NotNull String data, @NotNull String securityCheckResult, @Nullable String postBody, @Nullable Long timestamp) {
        byte[] bytes;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(securityCheckResult, "securityCheckResult");
        Charset charset = Charsets.UTF_8;
        byte[] bytes2 = data.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = securityCheckResult.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
        if (postBody != null) {
            bytes = postBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        } else {
            bytes = null;
        }
        return signWithHmacAndEnableShield(bytes2, bytes3, bytes, timestamp);
    }

    public final boolean verifySign(@NotNull String data, @NotNull String hera, @NotNull String zeus) {
        OooO0OO.OooO00o(data, "data", hera, "hera", zeus, "zeus");
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return verifySign(bytes, hera, zeus);
    }

    public static /* synthetic */ ZeusEntity aesEncrypt$default(Zeus zeus, byte[] bArr, byte[] bArr2, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return zeus.aesEncrypt(bArr, bArr2, l);
    }

    public static /* synthetic */ ZeusEntity shieldOnly$default(Zeus zeus, byte[] bArr, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return zeus.shieldOnly(bArr, l);
    }

    public static /* synthetic */ ZeusEntity signWithHmac$default(Zeus zeus, byte[] bArr, byte[] bArr2, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return zeus.signWithHmac(bArr, bArr2, l);
    }

    public static /* synthetic */ ZeusEntity signWithHmacAndEnableShield$default(Zeus zeus, byte[] bArr, byte[] bArr2, byte[] bArr3, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            bArr3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return zeus.signWithHmacAndEnableShield(bArr, bArr2, bArr3, l);
    }

    @NotNull
    public final ZeusEntity aesEncrypt(@NotNull byte[] data, @Nullable byte[] postBody, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(data, "data");
        return sign$default(this, data, 1, new AnonymousClass2(SV2.INSTANCE), null, timestamp, postBody, 8, null);
    }

    @NotNull
    public final ZeusEntity shieldOnly(@NotNull byte[] securityCheckResult, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(securityCheckResult, "securityCheckResult");
        String strGenerateHera = generateHera();
        return new ZeusEntity(generatorZeus("", 3), strGenerateHera, timestamp != null ? timestamp.longValue() : System.currentTimeMillis(), SV2.INSTANCE.a4(securityCheckResult, strGenerateHera));
    }

    @NotNull
    public final ZeusEntity signWithHmac(@NotNull byte[] data, @Nullable byte[] postBody, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(data, "data");
        return sign$default(this, data, 2, new C09082(SV2.INSTANCE), null, timestamp, postBody, 8, null);
    }

    @NotNull
    public final ZeusEntity signWithHmacAndEnableShield(@NotNull byte[] data, @NotNull byte[] securityCheckResult, @Nullable byte[] postBody, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(securityCheckResult, "securityCheckResult");
        String strGenerateHera = generateHera();
        SV2 sv2 = SV2.INSTANCE;
        ZeusEntity zeusEntity = new ZeusEntity(generatorZeus(sv2.a3(data, strGenerateHera), 3), strGenerateHera, timestamp != null ? timestamp.longValue() : System.currentTimeMillis(), sv2.a4(securityCheckResult, strGenerateHera));
        if (postBody != null) {
            zeusEntity.setEncryptedPostBody$signv2_release(sv2.a1(postBody, strGenerateHera));
        }
        return zeusEntity;
    }

    public final boolean verifySign(@NotNull byte[] data, @NotNull String hera, @NotNull String zeus) {
        String strA2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(hera, "hera");
        Intrinsics.checkNotNullParameter(zeus, "zeus");
        ZeusField zeus2 = parseZeus(zeus);
        if (zeus2 == null) {
            return false;
        }
        int al = zeus2.getAl();
        if (al != 1) {
            strA2 = (al == 2 || al == 3) ? SV2.INSTANCE.a3(data, hera) : "";
        } else {
            strA2 = SV2.INSTANCE.a2(data, hera);
        }
        return Intrinsics.areEqual(strA2, zeus2.getSign());
    }
}
