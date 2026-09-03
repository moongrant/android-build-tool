package p414o0Oo0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRedDotSpTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedDotSpTable.kt\ncom/yalla/yalla/data/sp/table/RedDotSpTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1855#2,2:203\n1855#2,2:205\n*S KotlinDebug\n*F\n+ 1 RedDotSpTable.kt\ncom/yalla/yalla/data/sp/table/RedDotSpTable\n*L\n139#1:203,2\n149#1:205,2\n*E\n"})
public final class oOo00OO0 extends OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f46403OooO0O0;

    public oOo00OO0() {
        super("RedDot_table");
        this.f46403OooO0O0 = "giftNewAnimationShowedGiftIdList";
    }

    public final boolean OooOO0O(int i) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0O0("roomGiftTitleRedDot-" + i + "-" + o0O00oO0.OooOOo0().getValue(), true);
    }

    public final boolean OooOO0o(@NotNull String giftId) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        ArrayList arrayList = new ArrayList();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strOooO0o0 = OooO0o0(this.f46403OooO0O0 + o0O00oO0.OooOOo0().getValue(), "");
        if (strOooO0o0.length() > 0) {
            Iterator it = StringsKt__StringsKt.split$default((CharSequence) strOooO0o0, new String[]{","}, false, 0, 6, (Object) null).iterator();
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
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o000oOoO.OooO0OO("roomGiftIconLoopStartForEverydayFirstShow", o0O00oO0.OooOOo0().getValue(), this, z);
    }

    public final void OooOOO0(int i) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO0o("addVipLevelDialog-" + i + "-" + o0O00oO0.OooOOo0().getValue(), false);
    }

    public final void OooOOOO(boolean z) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o000oOoO.OooO0OO("roomGiftIconRedDotForEverydayFirstShow", o0O00oO0.OooOOo0().getValue(), this, z);
        if (z) {
            OooO00o.f24527OooOOo0.OooO0Oo(true);
        }
    }

    public final void OooOOOo(int i, boolean z) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO0o("roomGiftTitleRedDot-" + i + "-" + o0O00oO0.OooOOo0().getValue(), z);
        if (z) {
            OooO00o.f24527OooOOo0.OooO0Oo(true);
        }
    }
}
