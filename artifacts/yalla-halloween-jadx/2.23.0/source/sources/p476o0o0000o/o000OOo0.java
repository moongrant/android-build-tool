package p476o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.service.room.processor.OooO;
import com.yalla.yalla.service.room.processor.OooO0OO;
import com.yalla.yalla.service.room.processor.OooO0o;
import com.yalla.yalla.service.room.processor.OooOO0;
import com.yalla.yalla.service.room.processor.OooOOO;
import com.yalla.yalla.service.room.processor.OooOOO0;
import com.yalla.yalla.service.room.processor.OooOOOO;
import com.yalla.yalla.service.room.processor.OooOo00;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0o f47594OooO00o = new OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOOO f47595OooO0O0 = new OooOOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f47596OooO0OO = new OooOo00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f47597OooO0Oo = new OooOOO0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f47599OooO0o0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f47598OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f47600OooO0oO = new OooOOOO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final OooO f47601OooO0oo = new OooO();

    public static boolean OooO00o(@Nullable byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        if (bArr.length == 0) {
            return false;
        }
        String str = new String(bArr, Charsets.UTF_8);
        if ((!StringsKt.Oooo00o(str, "{") || !StringsKt.OooOO0O(str, "}")) && (!StringsKt.Oooo00o(str, "[") || !StringsKt.OooOO0O(str, "]"))) {
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
