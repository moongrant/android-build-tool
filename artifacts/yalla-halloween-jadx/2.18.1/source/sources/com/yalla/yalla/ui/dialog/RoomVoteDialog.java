package com.yalla.yalla.ui.dialog;

import Oooo000.o000O0;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p466o0OooO0.o00000;
import p502o0o00o0.o00000O;
import p530o0o0OOO.o00OO00O;
import p535o0o0OOoO.oO0o0000;
import p544o0o0OoOO.d3;
import p579o0oOoOOo.e0;
import p579o0oOoOOo.f0;
import p649o0ooOOoo.sf;
import p649o0ooOOoo.uf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class RoomVoteDialog extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f23775OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final sf f23776OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f23777OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f23778OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public MaxHeightLinearLayoutManager f23779OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public CountDownTimer f23780OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f23781OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f23782Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<VoteRankModel> f23783o000oOoO;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomVoteDialog$VoteStatus;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "Running", "Ended", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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
    public RoomVoteDialog(@NotNull FragmentActivity context, @NotNull Function0<Unit> dismissListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        this.f23775OoooO = dismissListener;
        int i = 1;
        sf sfVarInflate = sf.inflate(LayoutInflater.from(context), this.f41545Oooo0oo, true);
        Intrinsics.checkNotNullExpressionValue(sfVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f23776OoooOO0 = sfVarInflate;
        this.f23777OoooOOO = true;
        sfVarInflate.f50609OooO0OO.setOnClickListener(this);
        sfVarInflate.f50608OooO0O0.setOnClickListener(this);
        sfVarInflate.f50614OooO0oo.setOnClickListener(this);
        f0 f0Var = new f0(this, this.f41543Oooo0o);
        this.f23783o000oOoO = f0Var;
        f0Var.setOnItemChildClickListener(new o00000(this));
        p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO = this.f23783o000oOoO;
        p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setOnItemClickListener(new oO0o0000(this, i));
        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = new MaxHeightLinearLayoutManager(this.f41543Oooo0o);
        this.f23779OoooOo0 = maxHeightLinearLayoutManager;
        sfVarInflate.f50611OooO0o.setLayoutManager(maxHeightLinearLayoutManager);
        RecyclerView recyclerView = sfVarInflate.f50611OooO0o;
        p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO3 = this.f23783o000oOoO;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        recyclerView.setAdapter(oooO0OO2);
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0Oo() {
        this.f23776OoooOO0.f50613OooO0oO.clearAnimation();
        this.f23775OoooO.invoke();
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!Intrinsics.areEqual(view, this.f23776OoooOO0.f50609OooO0OO)) {
            if (!Intrinsics.areEqual(view, this.f23776OoooOO0.f50614OooO0oo)) {
                OooO0O0();
                return;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(this.f41543Oooo0o);
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.room_vote_game_end_up_dialog_content));
            oo0ooo0.OooOoOO(true);
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.room_vote_game_end_up_dialog_confirm));
            oo0ooo0.OooOo0o(new e0(this));
            oo0ooo0.OooOOO0();
            return;
        }
        o00000O o00000o = new o00000O(this.f41543Oooo0o, 0);
        uf ufVarInflate = uf.inflate(LayoutInflater.from(o00000o.f41543Oooo0o), o00000o.f41545Oooo0oo, true);
        Intrinsics.checkNotNullExpressionValue(ufVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        Window window = o00000o.f41542Oooo;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.anim_bottom_top_bottom);
            window.setGravity(80);
        }
        ufVarInflate.f50732OooO0O0.setOnClickListener(new d3(o00000o, 1));
        o00000o.OooOO0();
    }

    public final void OooOO0O() {
        CountDownTimer countDownTimer = this.f23780OoooOoO;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
        }
        CountDownTimer countDownTimer2 = this.f23780OoooOoO;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.f23780OoooOoO = null;
    }

    public final void OooOO0o(boolean z) {
        if (!z) {
            SVGAView sVGAView = this.f23776OoooOO0.f50613OooO0oO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaView");
            oOO00O.OooO00o(sVGAView);
            return;
        }
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        RoomGameConfig.Vote value = oooO00o.OooO00o().f43362OoooOOO.getValue();
        boolean z2 = false;
        if (value != null && this.f23781OoooOoo == value.getVoteId()) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        RoomGameConfig.Vote value2 = oooO00o.OooO00o().f43362OoooOOO.getValue();
        this.f23781OoooOoo = value2 != null ? value2.getVoteId() : 0L;
        this.f23776OoooOO0.f50613OooO0oO.setLoops(1);
        SVGAView sVGAView2 = this.f23776OoooOO0.f50613OooO0oO;
        Context context = this.f41543Oooo0o;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        sVGAView2.OooO0oo("svga/room_vote_game_finish.svga", (FragmentActivity) context);
        this.f23776OoooOO0.f50613OooO0oO.OooO();
        SVGAView sVGAView3 = this.f23776OoooOO0.f50613OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.svgaView");
        oOO00O.OooO(sVGAView3);
    }

    public final String OooOOO0(long j, boolean z) {
        String string;
        String string2;
        String string3;
        long j2 = j / ((long) 1000);
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j4 / j3;
        long j6 = j4 % j3;
        long j7 = j2 % j3;
        if (z) {
            string = o000O0.OooO0O0(j5 >= 10 ? new StringBuilder() : o00O0O0O.OooO00o('0'), j5, ':');
        } else if (j5 >= 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(j5);
            sb.append(':');
            string = sb.toString();
        } else {
            boolean z2 = false;
            if (1 <= j5 && j5 < 10) {
                z2 = true;
            }
            if (z2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('0');
                sb2.append(j5);
                sb2.append(':');
                string = sb2.toString();
            } else {
                string = "";
            }
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
        if (j6 >= 10) {
            string2 = String.valueOf(j6);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(j6);
            string2 = sb3.toString();
        }
        sbOooO0o0.append(string2);
        String string4 = sbOooO0o0.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string4);
        sb4.append(':');
        if (j7 >= 10) {
            string3 = String.valueOf(j7);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('0');
            sb5.append(j7);
            string3 = sb5.toString();
        }
        sb4.append(string3);
        return sb4.toString();
    }
}
