package p409o0Oo0o0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O000;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRedDotSpTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedDotSpTable.kt\ncom/yalla/yalla/data/sp/table/RedDotSpTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1855#2,2:203\n1855#2,2:205\n*S KotlinDebug\n*F\n+ 1 RedDotSpTable.kt\ncom/yalla/yalla/data/sp/table/RedDotSpTable\n*L\n139#1:203,2\n149#1:205,2\n*E\n"})
public final class o00000OO extends o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f45212OooO0O0;

    public o00000OO() {
        super("RedDot_table");
        this.f45212OooO0O0 = "giftNewAnimationShowedGiftIdList";
    }

    public final boolean OooOO0O(int i) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        return OooO0O0("roomGiftTitleRedDot-" + i + "-" + o000000O.OooOOo0().getValue(), true);
    }

    public final boolean OooOO0o(@NotNull String giftId) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        ArrayList arrayList = new ArrayList();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strOooO0o0 = OooO0o0(this.f45212OooO0O0 + o000000O.OooOOo0().getValue(), "");
        if (strOooO0o0.length() > 0) {
            Iterator it = StringsKt__StringsKt.split$default(strOooO0o0, new String[]{","}, false, 0, 6, (Object) null).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual((String) it2.next(), giftId)) {
                return true;
            }
        }
        return false;
    }

    public final void OooOOO(boolean z) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o00O000.OooO0O0("roomGiftIconLoopStartForEverydayFirstShow", o000000O.OooOOo0().getValue(), this, z);
    }

    public final void OooOOO0(int i) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooO0o("addVipLevelDialog-" + i + "-" + o000000O.OooOOo0().getValue(), false);
    }

    public final void OooOOOO(boolean z) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o00O000.OooO0O0("roomGiftIconRedDotForEverydayFirstShow", o000000O.OooOOo0().getValue(), this, z);
        if (z) {
            OooO00o.f24989OooOOo0.OooO0Oo(true);
        }
    }

    public final void OooOOOo(int i, boolean z) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooO0o("roomGiftTitleRedDot-" + i + "-" + o000000O.OooOOo0().getValue(), z);
        if (z) {
            OooO00o.f24989OooOOo0.OooO0Oo(true);
        }
    }
}
