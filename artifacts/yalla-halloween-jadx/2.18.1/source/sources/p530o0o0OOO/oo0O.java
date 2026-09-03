package p530o0o0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p533o0o0OOOo.oO000;
import p533o0o0OOOo.oO00000o;
import p533o0o0OOOo.oO0000O;
import p533o0o0OOOo.oO0000o0;
import p533o0o0OOOo.oO000O0;
import p533o0o0OOOo.oO000O0O;
import p533o0o0OOOo.oO000o00;
import p533o0o0OOOo.oO00O0o0;
import p533o0o0OOOo.oO00O0oO;
import p533o0o0OOOo.oO00OO0O;
import p533o0o0OOOo.oO0O0OoO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final oO000O0O f43386OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0O f43387OooO00o = new oo0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final oO0000O f43388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final oO00000o f43389OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final oO000 f43390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final oO00OO0O f43391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final oO00O0o0 f43392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final oO0O0OoO f43393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final oO0000o0 f43394OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final oO00O0oO f43395OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final oO000O0 f43396OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final oO000o00 f43397OooOO0o;

    static {
        oO0000O oo0000o = new oO0000O();
        f43388OooO0O0 = oo0000o;
        oO00000o oo00000o = new oO00000o();
        f43389OooO0OO = oo00000o;
        oO000 oo000 = new oO000();
        f43390OooO0Oo = oo000;
        oO00O0o0 oo00o0o0 = new oO00O0o0();
        f43392OooO0o0 = oo00o0o0;
        oO00OO0O oo00oo0o = new oO00OO0O();
        f43391OooO0o = oo00oo0o;
        f43393OooO0oO = new oO0O0OoO();
        f43394OooO0oo = new oO0000o0();
        oO000O0O oo000o0o = new oO000O0O();
        f43386OooO = oo000o0o;
        f43395OooOO0 = new oO00O0oO();
        f43396OooOO0O = new oO000O0();
        oO000o00 oo000o00 = new oO000o00();
        f43397OooOO0o = oo000o00;
        Objects.requireNonNull(oo0000o);
        Intrinsics.checkNotNullParameter(oo00000o, "<set-?>");
        oo0000o.f43446OooO00o = oo00000o;
        Objects.requireNonNull(oo00o0o0);
        Intrinsics.checkNotNullParameter(oo00000o, "<set-?>");
        oo00o0o0.f43488OooO00o = oo00000o;
        oo000.f43445OooO00o = oo00000o;
        Objects.requireNonNull(oo00oo0o);
        Intrinsics.checkNotNullParameter(oo00000o, "<set-?>");
        oo00oo0o.f43499OooO00o = oo00000o;
        oo000o0o.f43455OooO00o = oo00000o;
        oo000o00.f43481OooO00o = oo00000o;
    }

    public final boolean OooO00o(@Nullable byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        if (bArr.length == 0) {
            return false;
        }
        String str = new String(bArr, Charsets.UTF_8);
        if ((!StringsKt.OooOoOO(str, "{") || !StringsKt__StringsJVMKt.endsWith$default(str, "}", false, 2, null)) && (!StringsKt.OooOoOO(str, "[") || !StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, null))) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
