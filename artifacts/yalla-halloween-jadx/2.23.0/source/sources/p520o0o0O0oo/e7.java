package p520o0o0O0oo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeShowKt;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p553o0oOOoo.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1595:1\n1855#2:1596\n1856#2:1600\n1855#2,2:1601\n1#3:1597\n215#4,2:1598\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$2\n*L\n957#1:1596\n957#1:1600\n976#1:1601,2\n963#1:1598,2\n*E\n"})
public final class e7 implements Observer<List<GiftPropAll>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53275OooO0Oo;

    public e7(x6 x6Var) {
        this.f53275OooO0Oo = x6Var;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<GiftPropAll> list) {
        Object next;
        List<GiftPropAll> giftList = list;
        Intrinsics.checkNotNullParameter(giftList, "giftList");
        x6 x6Var = this.f53275OooO0Oo;
        c6 c6Var = x6Var.f53391OooOo0o;
        boolean z = c6Var.f53259OooO0o;
        GiftPropTypeShow giftPropTypeShow = x6Var.f53374OooO;
        if (z) {
            for (GiftPropAll giftPropAll : giftList) {
                Iterator it = c6Var.f53255OooO00o.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((GiftSendFragment) next).getPageTypeUser() == giftPropAll.getGiftPropTypeUser()));
                GiftSendFragment giftSendFragment = (GiftSendFragment) next;
                if (giftSendFragment != null) {
                    giftSendFragment.refreshData(giftPropAll.getListForRegion(GiftPropTypeShowKt.getRegion(giftPropTypeShow)));
                }
                if (giftPropAll.getGiftPropTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                    String title = giftPropAll.getTitleNameForRegion();
                    long redPostCountLocal = giftPropAll.getRedPostCountLocal();
                    Intrinsics.checkNotNullParameter(title, "title");
                    Long lValueOf = Long.valueOf(redPostCountLocal);
                    LinkedHashMap linkedHashMap = c6Var.f53257OooO0OO;
                    linkedHashMap.put(title, lValueOf);
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        o0oO0O0o o0oo0o0o2 = x6Var.f53393OooOoO0;
                        if (o0oo0o0o2 != null) {
                            o0oo0o0o2.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                        }
                    }
                }
            }
            return;
        }
        c6Var.f53255OooO00o.clear();
        c6Var.f53256OooO0O0.clear();
        c6Var.f53258OooO0Oo = 0;
        for (GiftPropAll giftPropAll2 : giftList) {
            int giftPropTypeUser = giftPropAll2.getGiftPropTypeUser();
            int value = GiftPropTypeUser.Backpack.getValue();
            ArrayList arrayList = x6Var.f53387OooOo;
            if (giftPropTypeUser == value) {
                if (giftPropAll2.showIn(giftPropTypeShow)) {
                    arrayList.add(Integer.valueOf(giftPropAll2.getGiftPropTypeUser()));
                    GiftSendFragment.Companion companion = GiftSendFragment.INSTANCE;
                    int giftPropTypeUser2 = giftPropAll2.getGiftPropTypeUser();
                    List<GiftPropModel> listForRegion = giftPropAll2.getListForRegion(GiftPropTypeShowKt.getRegion(giftPropTypeShow));
                    companion.getClass();
                    c6Var.OooO00o(GiftSendFragment.Companion.OooO00o(giftPropTypeUser2, giftPropTypeShow, listForRegion), giftPropAll2.getTitleNameForRegion(), giftPropAll2.getRedPostCountLocal());
                }
            } else if ((!giftPropAll2.getListForRegion(GiftPropTypeShowKt.getRegion(giftPropTypeShow)).isEmpty()) && giftPropAll2.showIn(giftPropTypeShow)) {
                arrayList.add(Integer.valueOf(giftPropAll2.getGiftPropTypeUser()));
                GiftSendFragment.Companion companion2 = GiftSendFragment.INSTANCE;
                int giftPropTypeUser3 = giftPropAll2.getGiftPropTypeUser();
                List<GiftPropModel> listForRegion2 = giftPropAll2.getListForRegion(GiftPropTypeShowKt.getRegion(giftPropTypeShow));
                companion2.getClass();
                c6Var.OooO00o(GiftSendFragment.Companion.OooO00o(giftPropTypeUser3, giftPropTypeShow, listForRegion2), giftPropAll2.getTitleNameForRegion(), giftPropAll2.getRedPostCountLocal());
            }
        }
        c6Var.f53259OooO0o = true;
        Function1<? super List<GiftSendFragment>, Unit> function1 = c6Var.f53260OooO0o0;
        if (function1 != null) {
            function1.invoke(c6Var.f53255OooO00o);
        }
    }
}
