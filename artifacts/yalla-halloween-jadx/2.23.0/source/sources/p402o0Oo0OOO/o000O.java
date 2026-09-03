package p402o0Oo0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p534o0o0Oo00.o000oOoO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentInputCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentInputCacheManager.kt\ncom/yalla/yalla/data/cache/MomentInputCacheManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, o000oOoO> f44463OooO00o = new HashMap<>();

    @NotNull
    public static o000oOoO OooO00o(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
        o000oOoO o000oooo2;
        HashMap<String, o000oOoO> map = f44463OooO00o;
        if (l3 != null && l3.longValue() > 0) {
            o000oOoO o000oooo3 = map.get(l + "-" + l2 + "-" + l3);
            if (o000oooo3 == null) {
                o000oooo3 = new o000oOoO(0);
            }
            o000oooo2 = o000oooo3;
        } else if (l2 != null && l2.longValue() > 0) {
            o000oOoO o000oooo4 = map.get(l + "-" + l2);
            if (o000oooo4 == null) {
                o000oooo4 = new o000oOoO(0);
            }
            o000oooo2 = o000oooo4;
        } else if (l == null || l.longValue() <= 0) {
            o000oooo2 = new o000oOoO(0);
        } else {
            o000oOoO o000oooo5 = map.get(l.toString());
            if (o000oooo5 == null) {
                o000oooo5 = new o000oOoO(0);
            }
            o000oooo2 = o000oooo5;
        }
        OooOOO0.OooO0OO("MomentInputCacheManager", "get momentId: " + l + ", commentId: " + l2 + ", replyId: " + l3 + ", message: " + o000oooo2);
        return o000oooo2;
    }

    public static void OooO0O0(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull o000oOoO message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooOOO0.OooO0OO("MomentInputCacheManager", "put momentId: " + l + ", commentId: " + l2 + ", replyId: " + l3 + ", message: " + message);
        HashMap<String, o000oOoO> map = f44463OooO00o;
        if (l3 != null && l3.longValue() > 0) {
            map.put(l + "-" + l2 + "-" + l3, message);
            return;
        }
        if (l2 == null || l2.longValue() <= 0) {
            if (l == null || l.longValue() <= 0) {
                return;
            }
            map.put(l.toString(), message);
            return;
        }
        map.put(l + "-" + l2, message);
    }

    public static /* synthetic */ void OooO0OO(Long l, Long l2, o000oOoO o000oooo2, int i) {
        Long l3 = 0L;
        if ((i & 2) != 0) {
            l2 = l3;
        }
        l3 = (i & 4) == 0 ? null : 0L;
        if ((i & 8) != 0) {
            o000oooo2 = new o000oOoO(0);
        }
        OooO0O0(l, l2, l3, o000oooo2);
    }
}
