package p583o0oOoo00;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0oO.oO000O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentInputCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentInputCacheManager.kt\ncom/yalla/yalla/data/cache/MomentInputCacheManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, oO000O0> f56691OooO00o = new HashMap<>();

    @NotNull
    public static oO000O0 OooO00o(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
        oO000O0 oo000o0;
        HashMap<String, oO000O0> map = f56691OooO00o;
        if (l3 != null && l3.longValue() > 0) {
            oO000O0 oo000o1 = map.get(l + "-" + l2 + "-" + l3);
            if (oo000o1 == null) {
                oo000o1 = new oO000O0(0);
            }
            oo000o0 = oo000o1;
        } else if (l2 != null && l2.longValue() > 0) {
            oO000O0 oo000o2 = map.get(l + "-" + l2);
            if (oo000o2 == null) {
                oo000o2 = new oO000O0(0);
            }
            oo000o0 = oo000o2;
        } else if (l == null || l.longValue() <= 0) {
            oo000o0 = new oO000O0(0);
        } else {
            oO000O0 oo000o3 = map.get(l.toString());
            if (oo000o3 == null) {
                oo000o3 = new oO000O0(0);
            }
            oo000o0 = oo000o3;
        }
        o0000O00.OooO0OO("MomentInputCacheManager", "get momentId: " + l + ", commentId: " + l2 + ", replyId: " + l3 + ", message: " + oo000o0);
        return oo000o0;
    }

    public static void OooO0O0(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull oO000O0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o0000O00.OooO0OO("MomentInputCacheManager", "put momentId: " + l + ", commentId: " + l2 + ", replyId: " + l3 + ", message: " + message);
        HashMap<String, oO000O0> map = f56691OooO00o;
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

    public static /* synthetic */ void OooO0OO(Long l, Long l2, oO000O0 oo000o0, int i) {
        Long l3 = 0L;
        if ((i & 2) != 0) {
            l2 = l3;
        }
        l3 = (i & 4) == 0 ? null : 0L;
        if ((i & 8) != 0) {
            oo000o0 = new oO000O0(0);
        }
        OooO0O0(l, l2, l3, oo000o0);
    }
}
