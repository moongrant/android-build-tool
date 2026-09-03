package p650o0ooo;

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
import androidx.media3.session.o0000Ooo;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.Vip;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.activity.message.o00000;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371o0OOo0oO.o0OOO0o;
import p405o0Oo0OOO.k;
import p414o0Oo0oO.oO000o00;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLuckyPacketSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1864#2,3:576\n1864#2,3:579\n350#2,7:582\n*S KotlinDebug\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n*L\n511#1:576,3\n558#1:579,3\n423#1:582,7\n*E\n"})
public final class oO00OOOo extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58784OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final oO0OOo0o f58785OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f58786OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Drawable f58787OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58788OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58789OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58790OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58791OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58792OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Editable f58793OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58794OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58795OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f58796OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Editable f58797OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(@NotNull MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58784OooOO0O = activity;
        this.f58787OooOOO0 = o0000.OooO0O0(o0Oo0oo.room_dialog_lucky_packet_send_selected_l);
        this.f58786OooOOO = LazyKt.lazy(new oO00OO0O(this));
        int i = 2;
        this.f58788OooOOOO = new o00O00o0(CollectionsKt.mutableListOf(3, 5, 10, 15), 20, 5);
        this.f58789OooOOOo = new o00O00o0(CollectionsKt.mutableListOf(5, 10, 20, 30), 50, 10);
        this.f58791OooOOo0 = new o00O00o0(CollectionsKt.mutableListOf(5, 10, 20, 30), 100, 20);
        this.f58790OooOOo = new o00O00o0(CollectionsKt.mutableListOf(10, 20, 30, 50), 500, 50);
        this.f58792OooOOoo = new o00O00o0(CollectionsKt.mutableListOf(1, 3, 5, 7), 7, 3);
        this.f58795OooOo00 = new o00O00o0(CollectionsKt.mutableListOf(3, 5, 10, 15), 17, 5);
        this.f58794OooOo0 = new o00O00o0(CollectionsKt.mutableListOf(5, 10, 20, 30), 77, 20);
        this.f58796OooOo0O = new o00O00o0(CollectionsKt.mutableListOf(10, 20, 30, 50), 777, 50);
        ConstraintLayout constraintLayout = OooOO0().f44004OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f58510OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ConstraintLayout constraintLayout2 = OooOO0().f44004OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        o000O.OooO0oo(constraintLayout2, new oO000O0(this));
        ImageView info = OooOO0().f44042Oooo0o0;
        Intrinsics.checkNotNullExpressionValue(info, "info");
        o000O.OooO0oo(info, new oO000Oo0(this));
        LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume").observe(this.f58509OooO0o0, new o00000(i, this));
        AppCompatTextView switchGolds = OooOO0().f44034Oooo;
        Intrinsics.checkNotNullExpressionValue(switchGolds, "switchGolds");
        o000O.OooO0oo(switchGolds, new oO000Oo(this));
        AppCompatTextView switchGift = OooOO0().f44044Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(switchGift, "switchGift");
        o000O.OooO0oo(switchGift, new oO000o00(this));
        OooOO0().f44029OooOoOO.addTextChangedListener(new oO0O0OoO(this));
        AppCompatTextView appCompatTextView = OooOO0().f44043Oooo0oO;
        appCompatTextView.setText(o0000.OooO0OO(o000000.Send));
        Vip.INSTANCE.isNotVip(new oO00O0o0(appCompatTextView));
        Intrinsics.checkNotNull(appCompatTextView);
        o000O.OooO0oo(appCompatTextView, new oO00O0o(this));
        AppCompatTextView recharge = OooOO0().f44041Oooo0o;
        Intrinsics.checkNotNullExpressionValue(recharge, "recharge");
        o000O.OooO0oo(recharge, new oOo00OO0(this));
        AppCompatTextView history = OooOO0().f44040Oooo0OO;
        Intrinsics.checkNotNullExpressionValue(history, "history");
        o000O.OooO0oo(history, new oO00O0oO(this));
        AppCompatTextView golds0 = OooOO0().f44021OooOOoo;
        Intrinsics.checkNotNullExpressionValue(golds0, "golds0");
        o000O.OooO0oo(golds0, new oO0Oo(this));
        AppCompatTextView golds1 = OooOO0().f44023OooOo0;
        Intrinsics.checkNotNullExpressionValue(golds1, "golds1");
        o000O.OooO0oo(golds1, new o0oo0000(this));
        AppCompatTextView golds2 = OooOO0().f44026OooOo0o;
        Intrinsics.checkNotNullExpressionValue(golds2, "golds2");
        o000O.OooO0oo(golds2, new ooo0Oo0(this));
        AppCompatTextView golds3 = OooOO0().f44028OooOoO0;
        Intrinsics.checkNotNullExpressionValue(golds3, "golds3");
        o000O.OooO0oo(golds3, new o(this));
        AppCompatTextView goldsPackets0 = OooOO0().f44030OooOoo;
        Intrinsics.checkNotNullExpressionValue(goldsPackets0, "goldsPackets0");
        o000O.OooO0oo(goldsPackets0, new oO00000(this));
        AppCompatTextView goldsPackets1 = OooOO0().f44033OooOooo;
        Intrinsics.checkNotNullExpressionValue(goldsPackets1, "goldsPackets1");
        o000O.OooO0oo(goldsPackets1, new oO00000o(this));
        AppCompatTextView goldsPackets2 = OooOO0().f44037Oooo00O;
        Intrinsics.checkNotNullExpressionValue(goldsPackets2, "goldsPackets2");
        o000O.OooO0oo(goldsPackets2, new oO0000O(this));
        AppCompatTextView goldsPackets3 = OooOO0().f44035Oooo0;
        Intrinsics.checkNotNullExpressionValue(goldsPackets3, "goldsPackets3");
        o000O.OooO0oo(goldsPackets3, new oO0000Oo(this));
        AppCompatTextView giftSelectCount = OooOO0().f44020OooOOo0;
        Intrinsics.checkNotNullExpressionValue(giftSelectCount, "giftSelectCount");
        o000O.OooO0oo(giftSelectCount, new oO0000o0(this));
        AppCompatTextView giftSelect7 = OooOO0().f44015OooOOO;
        Intrinsics.checkNotNullExpressionValue(giftSelect7, "giftSelect7");
        o000O.OooO0oo(giftSelect7, new oO000(this));
        AppCompatTextView giftSelect17 = OooOO0().f44016OooOOO0;
        Intrinsics.checkNotNullExpressionValue(giftSelect17, "giftSelect17");
        o000O.OooO0oo(giftSelect17, new oO000O0O(this));
        AppCompatTextView giftSelect77 = OooOO0().f44017OooOOOO;
        Intrinsics.checkNotNullExpressionValue(giftSelect77, "giftSelect77");
        o000O.OooO0oo(giftSelect77, new oO0Ooooo(this));
        AppCompatTextView giftSelect777 = OooOO0().f44018OooOOOo;
        Intrinsics.checkNotNullExpressionValue(giftSelect777, "giftSelect777");
        o000O.OooO0oo(giftSelect777, new oO0o0o(this));
        AppCompatTextView giftPackets0 = OooOO0().f44007OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(giftPackets0, "giftPackets0");
        o000O.OooO0oo(giftPackets0, new oO0OoOO0(this));
        AppCompatTextView giftPackets1 = OooOO0().f44008OooO0o;
        Intrinsics.checkNotNullExpressionValue(giftPackets1, "giftPackets1");
        o000O.OooO0oo(giftPackets1, new oO0Oo0oo(this));
        AppCompatTextView giftPackets2 = OooOO0().f44011OooO0oo;
        Intrinsics.checkNotNullExpressionValue(giftPackets2, "giftPackets2");
        o000O.OooO0oo(giftPackets2, new oO000OOo(this));
        AppCompatTextView giftPackets3 = OooOO0().f44012OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftPackets3, "giftPackets3");
        o000O.OooO0oo(giftPackets3, new ooOOOOoo(this));
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this.f58507OooO0Oo, oo0o0Oo.room_dialog_lucky_packet_send_gift_item);
        this.f58785OooOO0o = oo0ooo0o;
        oo0ooo0o.OooOooo(o0Oo0oo.ic_empty_delete);
        oo0ooo0o.Oooo000(o000000.no_data);
        oo0ooo0o.f13176OooO0o = new o0000Ooo(this, i);
        OooOO0().f44014OooOO0o.setLayoutManager(new FixLinearLayoutManager(this.f58507OooO0Oo, 0));
        OooOO0().f44014OooOO0o.setAdapter(oo0ooo0o);
        p583o0oOoo00.o00000.f56631OooO0O0.observe(this.f58509OooO0o0, new Observer() { // from class: o0ooo.o0o0000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List list = (List) obj;
                oO00OOOo this$0 = this.f58733OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list == null || list.isEmpty()) {
                    this$0.f58785OooOO0o.OooOoO0(null);
                    return;
                }
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (((GiftPropModel) it.next()).getGiftId() == o00Ooo.OooO0oo().OooOOO()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                int i3 = i2 >= 0 ? i2 : 0;
                oO000o00 oo000o00OooO0oo = o00Ooo.OooO0oo();
                int giftId = ((GiftPropModel) list.get(i3)).getGiftId();
                oo000o00OooO0oo.getClass();
                oo000o00OooO0oo.OooO0oO(giftId, "giftId" + o0O00oO0.OooOOo0().getValue());
                oO000o00 oo000o00OooO0oo2 = o00Ooo.OooO0oo();
                long price = (long) ((GiftPropModel) list.get(i3)).getPrice();
                oo000o00OooO0oo2.getClass();
                oo000o00OooO0oo2.OooO0oo(price, "giftCoin" + o0O00oO0.OooOOo0().getValue());
                this$0.f58785OooOO0o.OooOoO0(list);
                this$0.OooOO0().f44014OooOO0o.scrollToPosition(i3);
                this$0.OooOO0().f44005OooO0O0.setText(String.valueOf(o00Ooo.OooO0oo().OooOO0o() * ((long) o00Ooo.OooO0oo().OooOOO0())));
            }
        });
        AppCompatTextView appCompatTextView2 = OooOO0().f44045OoooO0;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        appCompatTextView2.setText(String.valueOf(o0O00oO0.OooO0O0().getValue()));
        OooOOOo();
    }

    public final k OooOO0() {
        return (k) this.f58786OooOOO.getValue();
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            AppCompatEditText view = OooOO0().f44029OooOoOO;
            Intrinsics.checkNotNullExpressionValue(view, "goldsEditContent");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
            OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        }
    }

    public final void OooOO0o() {
        OooOO0().f44009OooO0o0.setVisibility(8);
        OooOO0().f44010OooO0oO.setVisibility(8);
        OooOO0().f44003OooO.setVisibility(8);
        OooOO0().f44013OooOO0O.setVisibility(8);
        oO000o00 oo000o00OooO0oo = o00Ooo.OooO0oo();
        oo000o00OooO0oo.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        int iOooO0OO = oo000o00OooO0oo.OooO0OO("giftPacketsIndex" + o0O00oO0.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f44009OooO0o0.setVisibility(0);
        } else if (iOooO0OO == 1) {
            OooOO0().f44010OooO0oO.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f44003OooO.setVisibility(0);
        } else if (iOooO0OO == 3) {
            OooOO0().f44013OooOO0O.setVisibility(0);
        }
        OooOO0().f44005OooO0O0.setText(String.valueOf(o00Ooo.OooO0oo().OooOO0o() * ((long) o00Ooo.OooO0oo().OooOOO0())));
    }

    public final void OooOOO(o00O00o0 o00o00o1) {
        OooOO0().f44024OooOo00.setVisibility(8);
        OooOO0().f44025OooOo0O.setVisibility(8);
        OooOO0().f44022OooOo.setVisibility(8);
        OooOO0().f44027OooOoO.setVisibility(8);
        int iOooOOOo = o00Ooo.OooO0oo().OooOOOo();
        int i = 0;
        if (iOooOOOo == 20) {
            OooOO0().f44024OooOo00.setVisibility(0);
        } else if (iOooOOOo == 50) {
            OooOO0().f44025OooOo0O.setVisibility(0);
        } else if (iOooOOOo == 100) {
            OooOO0().f44022OooOo.setVisibility(0);
        } else if (iOooOOOo == 500) {
            OooOO0().f44027OooOoO.setVisibility(0);
        }
        for (Object obj : o00o00o1.f58537OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f44030OooOoo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f44033OooOooo.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f44037Oooo00O.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f44035Oooo0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOOOO();
    }

    public final void OooOOO0(o00O00o0 o00o00o1) {
        AppCompatTextView appCompatTextView = OooOO0().f44020OooOOo0;
        int iOooOOO0 = o00Ooo.OooO0oo().OooOOO0();
        StringBuilder sb = new StringBuilder();
        sb.append(iOooOOO0);
        appCompatTextView.setText(sb.toString());
        OooOO0().f44019OooOOo.setVisibility(8);
        int i = 0;
        for (Object obj : o00o00o1.f58537OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f44007OooO0Oo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f44008OooO0o.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f44011OooO0oo.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f44012OooOO0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOO0o();
    }

    public final void OooOOOO() {
        OooOO0().f44032OooOooO.setVisibility(8);
        OooOO0().f44036Oooo000.setVisibility(8);
        OooOO0().f44038Oooo00o.setVisibility(8);
        OooOO0().f44039Oooo0O0.setVisibility(8);
        oO000o00 oo000o00OooO0oo = o00Ooo.OooO0oo();
        oo000o00OooO0oo.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        int iOooO0OO = oo000o00OooO0oo.OooO0OO("goldsPacketsIndex" + o0O00oO0.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f44032OooOooO.setVisibility(0);
            return;
        }
        if (iOooO0OO == 1) {
            OooOO0().f44036Oooo000.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f44038Oooo00o.setVisibility(0);
        } else {
            if (iOooO0OO != 3) {
                return;
            }
            OooOO0().f44039Oooo0O0.setVisibility(0);
        }
    }

    public final void OooOOOo() {
        boolean zOooOOo = o00Ooo.OooO0oo().OooOOo();
        Drawable drawable = this.f58787OooOOO0;
        if (zOooOOo) {
            OooOO0().f44034Oooo.setBackground(null);
            OooOO0().f44034Oooo.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FFFFFFF_50));
            OooOO0().f44034Oooo.setTextSize(13.0f);
            OooOO0().f44044Oooo0oo.setBackground(drawable);
            OooOO0().f44044Oooo0oo.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
            OooOO0().f44044Oooo0oo.setTextSize(14.0f);
            OooOO0().f44006OooO0OO.setVisibility(0);
            OooOO0().f44031OooOoo0.setVisibility(8);
            this.f58793OooOo = OooOO0().f44029OooOoOO.getText();
            OooOO0().f44029OooOoOO.setText(this.f58797OooOo0o);
            Editable editable = this.f58797OooOo0o;
            if (editable != null) {
                OooOO0().f44029OooOoOO.setSelection(editable.length());
            }
            int iOooOOO0 = o00Ooo.OooO0oo().OooOOO0();
            if (iOooOOO0 == 7) {
                OooOOO0(this.f58792OooOOoo);
                return;
            }
            if (iOooOOO0 == 17) {
                OooOOO0(this.f58795OooOo00);
                return;
            } else if (iOooOOO0 == 77) {
                OooOOO0(this.f58794OooOo0);
                return;
            } else {
                if (iOooOOO0 == 777) {
                    OooOOO0(this.f58796OooOo0O);
                    return;
                }
                return;
            }
        }
        OooOO0().f44044Oooo0oo.setBackground(null);
        OooOO0().f44044Oooo0oo.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FFFFFFF_50));
        OooOO0().f44044Oooo0oo.setTextSize(13.0f);
        OooOO0().f44034Oooo.setBackground(drawable);
        OooOO0().f44034Oooo.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
        OooOO0().f44034Oooo.setTextSize(14.0f);
        OooOO0().f44031OooOoo0.setVisibility(0);
        OooOO0().f44006OooO0OO.setVisibility(8);
        this.f58797OooOo0o = OooOO0().f44029OooOoOO.getText();
        OooOO0().f44029OooOoOO.setText(this.f58793OooOo);
        Editable editable2 = this.f58793OooOo;
        if (editable2 != null) {
            OooOO0().f44029OooOoOO.setSelection(editable2.length());
        }
        int iOooOOOo = o00Ooo.OooO0oo().OooOOOo();
        if (iOooOOOo == 20) {
            OooOOO(this.f58788OooOOOO);
            return;
        }
        if (iOooOOOo == 50) {
            OooOOO(this.f58789OooOOOo);
        } else if (iOooOOOo == 100) {
            OooOOO(this.f58791OooOOo0);
        } else if (iOooOOOo == 500) {
            OooOOO(this.f58790OooOOo);
        }
    }
}
