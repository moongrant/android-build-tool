package com.yalla.yalla.ui.dialog;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p203o00o0o0o.o00O0OO;
import p203o00o0o0o.oo0o0O0;
import p495o0o00Ooo.o0OOooO0;
import p519o0o0O0oO.j2;
import p519o0o0O0oO.k2;
import p519o0o0O0oO.l2;
import p519o0o0O0oO.o00O00OO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p641o0ooOOOO.i8;
import p641o0ooOOOO.k8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomVoteDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteDialog.kt\ncom/yalla/yalla/ui/dialog/RoomVoteDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class RoomVoteDialog extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f27956OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final i8 f27957OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f27958OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public l2 f27959OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f27960OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MaxHeightLinearLayoutManager f27961OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f27962OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public CountDownTimer f27963OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f27964OooOOoo;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomVoteDialog$VoteStatus;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "Running", "Ended", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum VoteStatus {
        Running(0),
        Ended(10);

        private int value;

        VoteStatus(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomVoteDialog(@NotNull FragmentActivity context, @NotNull o0OOooO0 dismissListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        this.f27956OooOO0O = dismissListener;
        i8 i8VarInflate = i8.inflate(LayoutInflater.from(context), this.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(i8VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f27957OooOO0o = i8VarInflate;
        this.f27958OooOOO = true;
        i8VarInflate.f58132OooO0OO.setOnClickListener(this);
        i8VarInflate.f58131OooO0O0.setOnClickListener(this);
        i8VarInflate.f58137OooO0oo.setOnClickListener(this);
        int i = oO00OO0O.room_item_vote_game_dialog;
        Context context2 = this.f52532OooO0Oo;
        l2 l2Var = new l2(this, context2, i);
        this.f27959OooOOO0 = l2Var;
        l2Var.f10101OooO0oo = new oo0o0O0(this);
        l2Var.f10098OooO0o = new o00O0OO(this);
        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = new MaxHeightLinearLayoutManager(context2);
        this.f27961OooOOOo = maxHeightLinearLayoutManager;
        RecyclerView recyclerView = i8VarInflate.f58134OooO0o;
        recyclerView.setLayoutManager(maxHeightLinearLayoutManager);
        l2 l2Var2 = this.f27959OooOOO0;
        if (l2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            l2Var2 = null;
        }
        recyclerView.setAdapter(l2Var2);
    }

    public static String OooOO0o(long j, boolean z) {
        String strOooO0O0;
        long j2 = j / ((long) 1000);
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j4 / j3;
        long j6 = j4 % j3;
        long j7 = j2 % j3;
        if (z) {
            strOooO0O0 = android.support.v4.media.session.OooO0o.OooO0O0(j5 >= 10 ? new StringBuilder() : new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO), j5, CertificateUtil.DELIMITER);
        } else if (j5 >= 10) {
            strOooO0O0 = j5 + CertificateUtil.DELIMITER;
        } else {
            if (1 <= j5 && j5 < 10) {
                strOooO0O0 = AppEventsConstants.EVENT_PARAM_VALUE_NO + j5 + CertificateUtil.DELIMITER;
            } else {
                strOooO0O0 = "";
            }
        }
        return p031OoooO0.o0OoOo0.OooO00o(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0O0, j6 >= 10 ? String.valueOf(j6) : androidx.compose.ui.input.key.OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, j6)), CertificateUtil.DELIMITER, j7 >= 10 ? String.valueOf(j7) : androidx.compose.ui.input.key.OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, j7));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0Oo() {
        this.f27957OooOO0o.f58136OooO0oO.clearAnimation();
        this.f27956OooOO0O.invoke();
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        i8 i8Var = this.f27957OooOO0o;
        boolean zAreEqual = Intrinsics.areEqual(view, i8Var.f58132OooO0OO);
        Context context = this.f52532OooO0Oo;
        if (!zAreEqual) {
            if (!Intrinsics.areEqual(view, i8Var.f58137OooO0oo)) {
                OooO0O0();
                return;
            }
            o0OO00O o0oo00o2 = new o0OO00O(context);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_vote_game_end_up_dialog_content));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.room_vote_game_end_up_dialog_confirm));
            o0oo00o2.OooOo0(new k2(this));
            o0oo00o2.OooOO0o();
            return;
        }
        o00O00OO o00o00oo2 = new o00O00OO(context, 0);
        k8 k8VarInflate = k8.inflate(LayoutInflater.from(o00o00oo2.f52532OooO0Oo), o00o00oo2.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(k8VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        Window window = o00o00oo2.f52535OooO0oO;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
            window.setGravity(80);
        }
        k8VarInflate.f58300OooO0O0.setOnClickListener(new j2(o00o00oo2, 0));
        o00o00oo2.OooO();
    }

    public final void OooOO0() {
        CountDownTimer countDownTimer = this.f27963OooOOo0;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
        }
        CountDownTimer countDownTimer2 = this.f27963OooOOo0;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.f27963OooOOo0 = null;
    }

    public final void OooOO0O(boolean z) {
        i8 i8Var = this.f27957OooOO0o;
        if (!z) {
            SVGAView sVGAView = i8Var.f58136OooO0oO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaView");
            o000OO00.OooO0O0(sVGAView);
            return;
        }
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        RoomGameConfig.Vote value = oooO00o.OooO00o().f25037Oooo0oO.getValue();
        if (value != null && this.f27962OooOOo == value.getVoteId()) {
            return;
        }
        RoomGameConfig.Vote value2 = oooO00o.OooO00o().f25037Oooo0oO.getValue();
        this.f27962OooOOo = value2 != null ? value2.getVoteId() : 0L;
        i8Var.f58136OooO0oO.setLoops(1);
        Context context = this.f52532OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        SVGAView sVGAView2 = i8Var.f58136OooO0oO;
        sVGAView2.OooOO0O("svga/room_vote_game_finish.svga", (FragmentActivity) context);
        sVGAView2.OooOO0o();
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaView");
        o000OO00.OooOOOO(sVGAView2);
    }
}
