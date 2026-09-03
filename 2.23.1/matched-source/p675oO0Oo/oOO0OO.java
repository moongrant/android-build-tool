package p675oO0Oo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00000O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.Vip;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.activity.message.o000000O;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.l;
import p416o0Oo0oO.oO000o00;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p585o0oOoo00.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLuckyPacketSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1864#2,3:576\n1864#2,3:579\n350#2,7:582\n*S KotlinDebug\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n*L\n511#1:576,3\n558#1:579,3\n423#1:582,7\n*E\n"})
public final class oOO0OO extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59751OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final oOO00 f59752OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f59753OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Drawable f59754OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59755OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59756OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59757OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59758OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59759OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Editable f59760OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59761OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59762OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final o0O0o000 f59763OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Editable f59764OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO(@NotNull MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59751OooOO0O = activity;
        this.f59754OooOOO0 = o0000.OooO0O0(o0OOO0o.room_dialog_lucky_packet_send_selected_l);
        this.f59753OooOOO = LazyKt.lazy(new oOO0O0O(this));
        int i = 1;
        int i2 = 2;
        this.f59755OooOOOO = new o0O0o000(CollectionsKt.mutableListOf(3, 5, 10, 15), 20, 5);
        this.f59756OooOOOo = new o0O0o000(CollectionsKt.mutableListOf(5, 10, 20, 30), 50, 10);
        this.f59758OooOOo0 = new o0O0o000(CollectionsKt.mutableListOf(5, 10, 20, 30), 100, 20);
        this.f59757OooOOo = new o0O0o000(CollectionsKt.mutableListOf(10, 20, 30, 50), 500, 50);
        this.f59759OooOOoo = new o0O0o000(CollectionsKt.mutableListOf(1, 3, 5, 7), 7, 3);
        this.f59762OooOo00 = new o0O0o000(CollectionsKt.mutableListOf(3, 5, 10, 15), 17, 5);
        this.f59761OooOo0 = new o0O0o000(CollectionsKt.mutableListOf(5, 10, 20, 30), 77, 20);
        this.f59763OooOo0O = new o0O0o000(CollectionsKt.mutableListOf(10, 20, 30, 50), 777, 50);
        ConstraintLayout constraintLayout = OooOO0().f44022OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f59575OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f59575OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ConstraintLayout constraintLayout2 = OooOO0().f44022OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        o000O.OooO0oo(constraintLayout2, new oO0o0000(this));
        ImageView info = OooOO0().f44060Oooo0o0;
        Intrinsics.checkNotNullExpressionValue(info, "info");
        o000O.OooO0oo(info, new oOO00O0(this));
        LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume").observe(this.f59574OooO0o0, new o000000O(i2, this));
        AppCompatTextView switchGolds = OooOO0().f44052Oooo;
        Intrinsics.checkNotNullExpressionValue(switchGolds, "switchGolds");
        o000O.OooO0oo(switchGolds, new oOO00OO(this));
        AppCompatTextView switchGift = OooOO0().f44062Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(switchGift, "switchGift");
        o000O.OooO0oo(switchGift, new ooooO000(this));
        OooOO0().f44047OooOoOO.addTextChangedListener(new oOO0(this));
        AppCompatTextView appCompatTextView = OooOO0().f44061Oooo0oO;
        appCompatTextView.setText(o0000.OooO0OO(o000OOo.Send));
        Vip.INSTANCE.isNotVip(new oOO0O000(appCompatTextView));
        Intrinsics.checkNotNull(appCompatTextView);
        o000O.OooO0oo(appCompatTextView, new oOO0O00O(this));
        AppCompatTextView recharge = OooOO0().f44059Oooo0o;
        Intrinsics.checkNotNullExpressionValue(recharge, "recharge");
        o000O.OooO0oo(recharge, new oOO0O0(this));
        AppCompatTextView history = OooOO0().f44058Oooo0OO;
        Intrinsics.checkNotNullExpressionValue(history, "history");
        o000O.OooO0oo(history, new oOO0O0O0(this));
        AppCompatTextView golds0 = OooOO0().f44039OooOOoo;
        Intrinsics.checkNotNullExpressionValue(golds0, "golds0");
        o000O.OooO0oo(golds0, new oO0O0O0o(this));
        AppCompatTextView golds1 = OooOO0().f44041OooOo0;
        Intrinsics.checkNotNullExpressionValue(golds1, "golds1");
        o000O.OooO0oo(golds1, new oOo0oooO(this));
        AppCompatTextView golds2 = OooOO0().f44044OooOo0o;
        Intrinsics.checkNotNullExpressionValue(golds2, "golds2");
        o000O.OooO0oo(golds2, new oO0O0Oo0(this));
        AppCompatTextView golds3 = OooOO0().f44046OooOoO0;
        Intrinsics.checkNotNullExpressionValue(golds3, "golds3");
        o000O.OooO0oo(golds3, new oOo0o0oO(this));
        AppCompatTextView goldsPackets0 = OooOO0().f44048OooOoo;
        Intrinsics.checkNotNullExpressionValue(goldsPackets0, "goldsPackets0");
        o000O.OooO0oo(goldsPackets0, new ooOOO0Oo(this));
        AppCompatTextView goldsPackets1 = OooOO0().f44051OooOooo;
        Intrinsics.checkNotNullExpressionValue(goldsPackets1, "goldsPackets1");
        o000O.OooO0oo(goldsPackets1, new ooOOO00O(this));
        AppCompatTextView goldsPackets2 = OooOO0().f44055Oooo00O;
        Intrinsics.checkNotNullExpressionValue(goldsPackets2, "goldsPackets2");
        o000O.OooO0oo(goldsPackets2, new ooo0o(this));
        AppCompatTextView goldsPackets3 = OooOO0().f44053Oooo0;
        Intrinsics.checkNotNullExpressionValue(goldsPackets3, "goldsPackets3");
        o000O.OooO0oo(goldsPackets3, new oO0OO00(this));
        AppCompatTextView giftSelectCount = OooOO0().f44038OooOOo0;
        Intrinsics.checkNotNullExpressionValue(giftSelectCount, "giftSelectCount");
        o000O.OooO0oo(giftSelectCount, new oO0OO0O(this));
        AppCompatTextView giftSelect7 = OooOO0().f44033OooOOO;
        Intrinsics.checkNotNullExpressionValue(giftSelect7, "giftSelect7");
        o000O.OooO0oo(giftSelect7, new oO0Oo0o0(this));
        AppCompatTextView giftSelect17 = OooOO0().f44034OooOOO0;
        Intrinsics.checkNotNullExpressionValue(giftSelect17, "giftSelect17");
        o000O.OooO0oo(giftSelect17, new oO0oO000(this));
        AppCompatTextView giftSelect77 = OooOO0().f44035OooOOOO;
        Intrinsics.checkNotNullExpressionValue(giftSelect77, "giftSelect77");
        o000O.OooO0oo(giftSelect77, new oOo00o00(this));
        AppCompatTextView giftSelect777 = OooOO0().f44036OooOOOo;
        Intrinsics.checkNotNullExpressionValue(giftSelect777, "giftSelect777");
        o000O.OooO0oo(giftSelect777, new oO(this));
        AppCompatTextView giftPackets0 = OooOO0().f44025OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(giftPackets0, "giftPackets0");
        o000O.OooO0oo(giftPackets0, new oOO00000(this));
        AppCompatTextView giftPackets1 = OooOO0().f44026OooO0o;
        Intrinsics.checkNotNullExpressionValue(giftPackets1, "giftPackets1");
        o000O.OooO0oo(giftPackets1, new oOO0000(this));
        AppCompatTextView giftPackets2 = OooOO0().f44029OooO0oo;
        Intrinsics.checkNotNullExpressionValue(giftPackets2, "giftPackets2");
        o000O.OooO0oo(giftPackets2, new oOO000(this));
        AppCompatTextView giftPackets3 = OooOO0().f44030OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftPackets3, "giftPackets3");
        o000O.OooO0oo(giftPackets3, new oOO000o(this));
        oOO00 ooo00 = new oOO00(this.f59572OooO0Oo, o0OO00O.room_dialog_lucky_packet_send_gift_item);
        this.f59752OooOO0o = ooo00;
        ooo00.OooOooo(o0OOO0o.ic_empty_delete);
        ooo00.Oooo000(o000OOo.no_data);
        ooo00.f13187OooO0o = new o00000O0(this, i);
        OooOO0().f44032OooOO0o.setLayoutManager(new FixLinearLayoutManager(this.f59572OooO0Oo, 0));
        OooOO0().f44032OooOO0o.setAdapter(ooo00);
        o00000.f56588OooO0O0.observe(this.f59574OooO0o0, new Observer() { // from class: oO0Oo.oO0O0O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List list = (List) obj;
                oOO0OO this$0 = this.f59706OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list == null || list.isEmpty()) {
                    this$0.f59752OooOO0o.OooOoO0(null);
                    return;
                }
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (((GiftPropModel) it.next()).getGiftId() == o00Oo0.OooO0oo().OooOOO()) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                int i4 = i3 >= 0 ? i3 : 0;
                oO000o00 oo000o00OooO0oo = o00Oo0.OooO0oo();
                int giftId = ((GiftPropModel) list.get(i4)).getGiftId();
                oo000o00OooO0oo.getClass();
                oo000o00OooO0oo.OooO0oO(giftId, "giftId" + oo0oO0.OooOOo0().getValue());
                oO000o00 oo000o00OooO0oo2 = o00Oo0.OooO0oo();
                long price = (long) ((GiftPropModel) list.get(i4)).getPrice();
                oo000o00OooO0oo2.getClass();
                oo000o00OooO0oo2.OooO0oo(price, "giftCoin" + oo0oO0.OooOOo0().getValue());
                this$0.f59752OooOO0o.OooOoO0(list);
                this$0.OooOO0().f44032OooOO0o.scrollToPosition(i4);
                this$0.OooOO0().f44023OooO0O0.setText(String.valueOf(o00Oo0.OooO0oo().OooOO0o() * ((long) o00Oo0.OooO0oo().OooOOO0())));
            }
        });
        AppCompatTextView appCompatTextView2 = OooOO0().f44063OoooO0;
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        appCompatTextView2.setText(String.valueOf(oo0oO0.OooO0O0().getValue()));
        OooOOOo();
    }

    public final l OooOO0() {
        return (l) this.f59753OooOOO.getValue();
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            AppCompatEditText view = OooOO0().f44047OooOoOO;
            Intrinsics.checkNotNullExpressionValue(view, "goldsEditContent");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
            p373o0OOo0oO.o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        }
    }

    public final void OooOO0o() {
        OooOO0().f44027OooO0o0.setVisibility(8);
        OooOO0().f44028OooO0oO.setVisibility(8);
        OooOO0().f44021OooO.setVisibility(8);
        OooOO0().f44031OooOO0O.setVisibility(8);
        oO000o00 oo000o00OooO0oo = o00Oo0.OooO0oo();
        oo000o00OooO0oo.getClass();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        int iOooO0OO = oo000o00OooO0oo.OooO0OO("giftPacketsIndex" + oo0oO0.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f44027OooO0o0.setVisibility(0);
        } else if (iOooO0OO == 1) {
            OooOO0().f44028OooO0oO.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f44021OooO.setVisibility(0);
        } else if (iOooO0OO == 3) {
            OooOO0().f44031OooOO0O.setVisibility(0);
        }
        OooOO0().f44023OooO0O0.setText(String.valueOf(o00Oo0.OooO0oo().OooOO0o() * ((long) o00Oo0.OooO0oo().OooOOO0())));
    }

    public final void OooOOO(o0O0o000 o0o0o000) {
        OooOO0().f44042OooOo00.setVisibility(8);
        OooOO0().f44043OooOo0O.setVisibility(8);
        OooOO0().f44040OooOo.setVisibility(8);
        OooOO0().f44045OooOoO.setVisibility(8);
        int iOooOOOo = o00Oo0.OooO0oo().OooOOOo();
        int i = 0;
        if (iOooOOOo == 20) {
            OooOO0().f44042OooOo00.setVisibility(0);
        } else if (iOooOOOo == 50) {
            OooOO0().f44043OooOo0O.setVisibility(0);
        } else if (iOooOOOo == 100) {
            OooOO0().f44040OooOo.setVisibility(0);
        } else if (iOooOOOo == 500) {
            OooOO0().f44045OooOoO.setVisibility(0);
        }
        for (Object obj : o0o0o000.f59492OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f44048OooOoo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f44051OooOooo.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f44055Oooo00O.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f44053Oooo0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOOOO();
    }

    public final void OooOOO0(o0O0o000 o0o0o000) {
        AppCompatTextView appCompatTextView = OooOO0().f44038OooOOo0;
        int iOooOOO0 = o00Oo0.OooO0oo().OooOOO0();
        StringBuilder sb = new StringBuilder();
        sb.append(iOooOOO0);
        appCompatTextView.setText(sb.toString());
        OooOO0().f44037OooOOo.setVisibility(8);
        int i = 0;
        for (Object obj : o0o0o000.f59492OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f44025OooO0Oo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f44026OooO0o.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f44029OooO0oo.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f44030OooOO0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOO0o();
    }

    public final void OooOOOO() {
        OooOO0().f44050OooOooO.setVisibility(8);
        OooOO0().f44054Oooo000.setVisibility(8);
        OooOO0().f44056Oooo00o.setVisibility(8);
        OooOO0().f44057Oooo0O0.setVisibility(8);
        oO000o00 oo000o00OooO0oo = o00Oo0.OooO0oo();
        oo000o00OooO0oo.getClass();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        int iOooO0OO = oo000o00OooO0oo.OooO0OO("goldsPacketsIndex" + oo0oO0.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f44050OooOooO.setVisibility(0);
            return;
        }
        if (iOooO0OO == 1) {
            OooOO0().f44054Oooo000.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f44056Oooo00o.setVisibility(0);
        } else {
            if (iOooO0OO != 3) {
                return;
            }
            OooOO0().f44057Oooo0O0.setVisibility(0);
        }
    }

    public final void OooOOOo() {
        boolean zOooOOo = o00Oo0.OooO0oo().OooOOo();
        Drawable drawable = this.f59754OooOOO0;
        if (zOooOOo) {
            OooOO0().f44052Oooo.setBackground(null);
            OooOO0().f44052Oooo.setTextColor(o0000.OooO00o(o0ooOOo.color_FFFFFFF_50));
            OooOO0().f44052Oooo.setTextSize(13.0f);
            OooOO0().f44062Oooo0oo.setBackground(drawable);
            OooOO0().f44062Oooo0oo.setTextColor(o0000.OooO00o(o0ooOOo.color_white));
            OooOO0().f44062Oooo0oo.setTextSize(14.0f);
            OooOO0().f44024OooO0OO.setVisibility(0);
            OooOO0().f44049OooOoo0.setVisibility(8);
            this.f59760OooOo = OooOO0().f44047OooOoOO.getText();
            OooOO0().f44047OooOoOO.setText(this.f59764OooOo0o);
            Editable editable = this.f59764OooOo0o;
            if (editable != null) {
                OooOO0().f44047OooOoOO.setSelection(editable.length());
            }
            int iOooOOO0 = o00Oo0.OooO0oo().OooOOO0();
            if (iOooOOO0 == 7) {
                OooOOO0(this.f59759OooOOoo);
                return;
            }
            if (iOooOOO0 == 17) {
                OooOOO0(this.f59762OooOo00);
                return;
            } else if (iOooOOO0 == 77) {
                OooOOO0(this.f59761OooOo0);
                return;
            } else {
                if (iOooOOO0 == 777) {
                    OooOOO0(this.f59763OooOo0O);
                    return;
                }
                return;
            }
        }
        OooOO0().f44062Oooo0oo.setBackground(null);
        OooOO0().f44062Oooo0oo.setTextColor(o0000.OooO00o(o0ooOOo.color_FFFFFFF_50));
        OooOO0().f44062Oooo0oo.setTextSize(13.0f);
        OooOO0().f44052Oooo.setBackground(drawable);
        OooOO0().f44052Oooo.setTextColor(o0000.OooO00o(o0ooOOo.color_white));
        OooOO0().f44052Oooo.setTextSize(14.0f);
        OooOO0().f44049OooOoo0.setVisibility(0);
        OooOO0().f44024OooO0OO.setVisibility(8);
        this.f59764OooOo0o = OooOO0().f44047OooOoOO.getText();
        OooOO0().f44047OooOoOO.setText(this.f59760OooOo);
        Editable editable2 = this.f59760OooOo;
        if (editable2 != null) {
            OooOO0().f44047OooOoOO.setSelection(editable2.length());
        }
        int iOooOOOo = o00Oo0.OooO0oo().OooOOOo();
        if (iOooOOOo == 20) {
            OooOOO(this.f59755OooOOOO);
            return;
        }
        if (iOooOOOo == 50) {
            OooOOO(this.f59756OooOOOo);
        } else if (iOooOOOo == 100) {
            OooOOO(this.f59758OooOOo0);
        } else if (iOooOOOo == 500) {
            OooOOO(this.f59757OooOOo);
        }
    }
}
