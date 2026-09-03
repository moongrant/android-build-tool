package p519o0o0O0oO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLuckyPacketSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog$29\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n350#2,7:576\n*S KotlinDebug\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog$29\n*L\n423#1:576,7\n*E\n"})
public final class oO0O0 implements Observer<List<? extends GiftPropModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52859OooO0Oo;

    public oO0O0(oO0o0000 oo0o0000) {
        this.f52859OooO0Oo = oo0o0000;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends GiftPropModel> list) {
        List<? extends GiftPropModel> list2 = list;
        oO0o0000 oo0o0000 = this.f52859OooO0Oo;
        if (list2 == null || list2.isEmpty()) {
            oo0o0000.f52885OooOO0o.OooOoO0(null);
            return;
        }
        Iterator<? extends GiftPropModel> it = list2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (it.next().getGiftId() == o00Oo0.OooO0oo().OooOOO()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = i >= 0 ? i : 0;
        o000000O o000000oOooO0oo = o00Oo0.OooO0oo();
        int giftId = list2.get(i2).getGiftId();
        o000000oOooO0oo.getClass();
        o000000oOooO0oo.OooO0oO(giftId, "giftId" + p464o0Oooo.o000000O.OooOOo0().getValue());
        o000000O o000000oOooO0oo2 = o00Oo0.OooO0oo();
        long price = (long) list2.get(i2).getPrice();
        o000000oOooO0oo2.getClass();
        o000000oOooO0oo2.OooO0oo(price, "giftCoin" + p464o0Oooo.o000000O.OooOOo0().getValue());
        oo0o0000.f52885OooOO0o.OooOoO0(list2);
        oo0o0000.OooOO0().f59301OooOO0o.scrollToPosition(i2);
        oo0o0000.OooOO0().f59292OooO0O0.setText(String.valueOf(o00Oo0.OooO0oo().OooOO0o() * ((long) o00Oo0.OooO0oo().OooOOO0())));
    }
}
