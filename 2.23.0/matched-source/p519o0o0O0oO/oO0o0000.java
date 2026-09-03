package p519o0o0O0oO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.impl.o0000Ooo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.Vip;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p402o0Oo0OOO.o0O0ooO;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLuckyPacketSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1864#2,3:576\n1864#2,3:579\n*S KotlinDebug\n*F\n+ 1 LuckyPacketSendDialog.kt\ncom/yalla/yalla/ui/dialog/LuckyPacketSendDialog\n*L\n511#1:576,3\n558#1:579,3\n*E\n"})
public final class oO0o0000 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f52884OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final oO0O00oO f52885OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f52886OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Drawable f52887OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O000O f52888OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o0O000O f52889OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o0O000O f52890OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o0O000O f52891OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o0O000O f52892OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Editable f52893OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o0O000O f52894OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o0O000O f52895OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final o0O000O f52896OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Editable f52897OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(@NotNull MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52884OooOO0O = activity;
        this.f52887OooOOO0 = o0000.OooO0O0(oOo00OO0.room_dialog_lucky_packet_send_selected_l);
        this.f52886OooOOO = LazyKt.lazy(new oO0OO0O(this));
        this.f52888OooOOOO = new o0O000O(CollectionsKt.mutableListOf(3, 5, 10, 15), 20, 5);
        this.f52889OooOOOo = new o0O000O(CollectionsKt.mutableListOf(5, 10, 20, 30), 50, 10);
        this.f52891OooOOo0 = new o0O000O(CollectionsKt.mutableListOf(5, 10, 20, 30), 100, 20);
        this.f52890OooOOo = new o0O000O(CollectionsKt.mutableListOf(10, 20, 30, 50), 500, 50);
        this.f52892OooOOoo = new o0O000O(CollectionsKt.mutableListOf(1, 3, 5, 7), 7, 3);
        this.f52895OooOo00 = new o0O000O(CollectionsKt.mutableListOf(3, 5, 10, 15), 17, 5);
        this.f52894OooOo0 = new o0O000O(CollectionsKt.mutableListOf(5, 10, 20, 30), 77, 20);
        this.f52896OooOo0O = new o0O000O(CollectionsKt.mutableListOf(10, 20, 30, 50), 777, 50);
        ConstraintLayout constraintLayout = OooOO0().f59291OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f52535OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ConstraintLayout constraintLayout2 = OooOO0().f59291OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
        o000OO00.OooO0oo(constraintLayout2, new oOo0000O(this));
        ImageView imageView = OooOO0().f59329Oooo0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.info");
        o000OO00.OooO0oo(imageView, new oO0O0O00(this));
        LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume").observe(this.f52534OooO0o0, new oO0O0O0o(this));
        AppCompatTextView appCompatTextView = OooOO0().f59321Oooo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.switchGolds");
        o000OO00.OooO0oo(appCompatTextView, new oOo0oooO(this));
        AppCompatTextView appCompatTextView2 = OooOO0().f59331Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.switchGift");
        o000OO00.OooO0oo(appCompatTextView2, new oO0O0Oo0(this));
        OooOO0().f59316OooOoOO.addTextChangedListener(new oOo0o0oO(this));
        AppCompatTextView it = OooOO0().f59330Oooo0oO;
        it.setText(o0000.OooO0OO(oO00OOo0.Send));
        Vip.INSTANCE.isNotVip(new ooOOO0Oo(it));
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooO0oo(it, new ooOOO00O(this));
        AppCompatTextView appCompatTextView3 = OooOO0().f59328Oooo0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.recharge");
        o000OO00.OooO0oo(appCompatTextView3, new ooo0o(this));
        AppCompatTextView appCompatTextView4 = OooOO0().f59327Oooo0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "binding.history");
        o000OO00.OooO0oo(appCompatTextView4, new oO0OO00(this));
        AppCompatTextView appCompatTextView5 = OooOO0().f59308OooOOoo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "binding.golds0");
        o000OO00.OooO0oo(appCompatTextView5, new oOOoOOO0(this));
        AppCompatTextView appCompatTextView6 = OooOO0().f59310OooOo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "binding.golds1");
        o000OO00.OooO0oo(appCompatTextView6, new oO00o000(this));
        AppCompatTextView appCompatTextView7 = OooOO0().f59313OooOo0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "binding.golds2");
        o000OO00.OooO0oo(appCompatTextView7, new oO00o00(this));
        AppCompatTextView appCompatTextView8 = OooOO0().f59315OooOoO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "binding.golds3");
        o000OO00.OooO0oo(appCompatTextView8, new oO0OOO00(this));
        AppCompatTextView appCompatTextView9 = OooOO0().f59317OooOoo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView9, "binding.goldsPackets0");
        o000OO00.OooO0oo(appCompatTextView9, new oO00o00O(this));
        AppCompatTextView appCompatTextView10 = OooOO0().f59320OooOooo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "binding.goldsPackets1");
        o000OO00.OooO0oo(appCompatTextView10, new oO00o0(this));
        AppCompatTextView appCompatTextView11 = OooOO0().f59324Oooo00O;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView11, "binding.goldsPackets2");
        o000OO00.OooO0oo(appCompatTextView11, new oOo00o0o(this));
        AppCompatTextView appCompatTextView12 = OooOO0().f59322Oooo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView12, "binding.goldsPackets3");
        o000OO00.OooO0oo(appCompatTextView12, new oOo00ooO(this));
        AppCompatTextView appCompatTextView13 = OooOO0().f59307OooOOo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView13, "binding.giftSelectCount");
        o000OO00.OooO0oo(appCompatTextView13, new oO0OO00o(this));
        AppCompatTextView appCompatTextView14 = OooOO0().f59302OooOOO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView14, "binding.giftSelect7");
        o000OO00.OooO0oo(appCompatTextView14, new oOo000Oo(this));
        AppCompatTextView appCompatTextView15 = OooOO0().f59303OooOOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView15, "binding.giftSelect17");
        o000OO00.OooO0oo(appCompatTextView15, new oOo000o0(this));
        AppCompatTextView appCompatTextView16 = OooOO0().f59304OooOOOO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView16, "binding.giftSelect77");
        o000OO00.OooO0oo(appCompatTextView16, new oO0(this));
        AppCompatTextView appCompatTextView17 = OooOO0().f59305OooOOOo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView17, "binding.giftSelect777");
        o000OO00.OooO0oo(appCompatTextView17, new oO0O000(this));
        AppCompatTextView appCompatTextView18 = OooOO0().f59294OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView18, "binding.giftPackets0");
        o000OO00.OooO0oo(appCompatTextView18, new oO0O000o(this));
        AppCompatTextView appCompatTextView19 = OooOO0().f59295OooO0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView19, "binding.giftPackets1");
        o000OO00.OooO0oo(appCompatTextView19, new oO0O00(this));
        AppCompatTextView appCompatTextView20 = OooOO0().f59298OooO0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView20, "binding.giftPackets2");
        o000OO00.OooO0oo(appCompatTextView20, new oO0O00O(this));
        AppCompatTextView appCompatTextView21 = OooOO0().f59299OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView21, "binding.giftPackets3");
        o000OO00.OooO0oo(appCompatTextView21, new oO0O00o0(this));
        oO0O00oO oo0o00oo = new oO0O00oO(this.f52532OooO0Oo, oO00OO0O.room_dialog_lucky_packet_send_gift_item);
        this.f52885OooOO0o = oo0o00oo;
        oo0o00oo.OooOooo(oOo00OO0.ic_empty_delete);
        oo0o00oo.Oooo000(oO00OOo0.no_data);
        oo0o00oo.f10098OooO0o = new o0000Ooo(this);
        OooOO0().f59301OooOO0o.setLayoutManager(new FixLinearLayoutManager(this.f52532OooO0Oo, 0));
        OooOO0().f59301OooOO0o.setAdapter(oo0o00oo);
        o0O0ooO.f44522OooO0O0.observe(this.f52534OooO0o0, new oO0O0(this));
        AppCompatTextView appCompatTextView22 = OooOO0().f59332OoooO0;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        appCompatTextView22.setText(String.valueOf(o000000O.OooO0O0().getValue()));
        OooOOOo();
    }

    public final x7 OooOO0() {
        return (x7) this.f52886OooOOO.getValue();
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            AppCompatEditText view = OooOO0().f59316OooOoOO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.goldsEditContent");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
            OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        }
    }

    public final void OooOO0o() {
        OooOO0().f59296OooO0o0.setVisibility(8);
        OooOO0().f59297OooO0oO.setVisibility(8);
        OooOO0().f59290OooO.setVisibility(8);
        OooOO0().f59300OooOO0O.setVisibility(8);
        p409o0Oo0o0o.o000000O o000000oOooO0oo = o00Oo0.OooO0oo();
        o000000oOooO0oo.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        int iOooO0OO = o000000oOooO0oo.OooO0OO("giftPacketsIndex" + o000000O.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f59296OooO0o0.setVisibility(0);
        } else if (iOooO0OO == 1) {
            OooOO0().f59297OooO0oO.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f59290OooO.setVisibility(0);
        } else if (iOooO0OO == 3) {
            OooOO0().f59300OooOO0O.setVisibility(0);
        }
        OooOO0().f59292OooO0O0.setText(String.valueOf(o00Oo0.OooO0oo().OooOO0o() * ((long) o00Oo0.OooO0oo().OooOOO0())));
    }

    public final void OooOOO(o0O000O o0o000o) {
        OooOO0().f59311OooOo00.setVisibility(8);
        OooOO0().f59312OooOo0O.setVisibility(8);
        OooOO0().f59309OooOo.setVisibility(8);
        OooOO0().f59314OooOoO.setVisibility(8);
        int iOooOOOo = o00Oo0.OooO0oo().OooOOOo();
        int i = 0;
        if (iOooOOOo == 20) {
            OooOO0().f59311OooOo00.setVisibility(0);
        } else if (iOooOOOo == 50) {
            OooOO0().f59312OooOo0O.setVisibility(0);
        } else if (iOooOOOo == 100) {
            OooOO0().f59309OooOo.setVisibility(0);
        } else if (iOooOOOo == 500) {
            OooOO0().f59314OooOoO.setVisibility(0);
        }
        for (Object obj : o0o000o.f52628OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f59317OooOoo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f59320OooOooo.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f59324Oooo00O.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f59322Oooo0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOOOO();
    }

    public final void OooOOO0(o0O000O o0o000o) {
        AppCompatTextView appCompatTextView = OooOO0().f59307OooOOo0;
        int iOooOOO0 = o00Oo0.OooO0oo().OooOOO0();
        StringBuilder sb = new StringBuilder();
        sb.append(iOooOOO0);
        appCompatTextView.setText(sb.toString());
        OooOO0().f59306OooOOo.setVisibility(8);
        int i = 0;
        for (Object obj : o0o000o.f52628OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0().f59294OooO0Oo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0().f59295OooO0o.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0().f59298OooO0oo.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0().f59299OooOO0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOO0o();
    }

    public final void OooOOOO() {
        OooOO0().f59319OooOooO.setVisibility(8);
        OooOO0().f59323Oooo000.setVisibility(8);
        OooOO0().f59325Oooo00o.setVisibility(8);
        OooOO0().f59326Oooo0O0.setVisibility(8);
        p409o0Oo0o0o.o000000O o000000oOooO0oo = o00Oo0.OooO0oo();
        o000000oOooO0oo.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        int iOooO0OO = o000000oOooO0oo.OooO0OO("goldsPacketsIndex" + o000000O.OooOOo0().getValue(), 1);
        if (iOooO0OO == 0) {
            OooOO0().f59319OooOooO.setVisibility(0);
            return;
        }
        if (iOooO0OO == 1) {
            OooOO0().f59323Oooo000.setVisibility(0);
        } else if (iOooO0OO == 2) {
            OooOO0().f59325Oooo00o.setVisibility(0);
        } else {
            if (iOooO0OO != 3) {
                return;
            }
            OooOO0().f59326Oooo0O0.setVisibility(0);
        }
    }

    public final void OooOOOo() {
        boolean zOooOOo = o00Oo0.OooO0oo().OooOOo();
        Drawable drawable = this.f52887OooOOO0;
        if (zOooOOo) {
            OooOO0().f59321Oooo.setBackground(null);
            OooOO0().f59321Oooo.setTextColor(o0000.OooO00o(oO00O0o.color_FFFFFFF_50));
            OooOO0().f59321Oooo.setTextSize(13.0f);
            OooOO0().f59331Oooo0oo.setBackground(drawable);
            OooOO0().f59331Oooo0oo.setTextColor(o0000.OooO00o(oO00O0o.color_white));
            OooOO0().f59331Oooo0oo.setTextSize(14.0f);
            OooOO0().f59293OooO0OO.setVisibility(0);
            OooOO0().f59318OooOoo0.setVisibility(8);
            this.f52893OooOo = OooOO0().f59316OooOoOO.getText();
            OooOO0().f59316OooOoOO.setText(this.f52897OooOo0o);
            Editable editable = this.f52897OooOo0o;
            if (editable != null) {
                OooOO0().f59316OooOoOO.setSelection(editable.length());
            }
            int iOooOOO0 = o00Oo0.OooO0oo().OooOOO0();
            if (iOooOOO0 == 7) {
                OooOOO0(this.f52892OooOOoo);
                return;
            }
            if (iOooOOO0 == 17) {
                OooOOO0(this.f52895OooOo00);
                return;
            } else if (iOooOOO0 == 77) {
                OooOOO0(this.f52894OooOo0);
                return;
            } else {
                if (iOooOOO0 == 777) {
                    OooOOO0(this.f52896OooOo0O);
                    return;
                }
                return;
            }
        }
        OooOO0().f59331Oooo0oo.setBackground(null);
        OooOO0().f59331Oooo0oo.setTextColor(o0000.OooO00o(oO00O0o.color_FFFFFFF_50));
        OooOO0().f59331Oooo0oo.setTextSize(13.0f);
        OooOO0().f59321Oooo.setBackground(drawable);
        OooOO0().f59321Oooo.setTextColor(o0000.OooO00o(oO00O0o.color_white));
        OooOO0().f59321Oooo.setTextSize(14.0f);
        OooOO0().f59318OooOoo0.setVisibility(0);
        OooOO0().f59293OooO0OO.setVisibility(8);
        this.f52897OooOo0o = OooOO0().f59316OooOoOO.getText();
        OooOO0().f59316OooOoOO.setText(this.f52893OooOo);
        Editable editable2 = this.f52893OooOo;
        if (editable2 != null) {
            OooOO0().f59316OooOoOO.setSelection(editable2.length());
        }
        int iOooOOOo = o00Oo0.OooO0oo().OooOOOo();
        if (iOooOOOo == 20) {
            OooOOO(this.f52888OooOOOO);
            return;
        }
        if (iOooOOOo == 50) {
            OooOOO(this.f52889OooOOOo);
        } else if (iOooOOOo == 100) {
            OooOOO(this.f52891OooOOo0);
        } else if (iOooOOOo == 500) {
            OooOOO(this.f52890OooOOo);
        }
    }
}
