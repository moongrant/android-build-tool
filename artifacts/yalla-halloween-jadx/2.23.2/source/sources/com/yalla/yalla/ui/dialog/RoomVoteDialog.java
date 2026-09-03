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
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.w;
import p405o0Oo0OOO.y;
import p499o0o00o.oOo00OO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.oo0o0Oo;
import p650o0ooo.k2;
import p650o0ooo.l2;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomVoteDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteDialog.kt\ncom/yalla/yalla/ui/dialog/RoomVoteDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class RoomVoteDialog extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f27493OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final w f27494OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f27495OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public l2 f27496OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f27497OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MaxHeightLinearLayoutManager f27498OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f27499OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public CountDownTimer f27500OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f27501OooOOoo;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.yalla.yalla.ui.dialog.RoomVoteDialog$VoteStatus[], still in use, count: 1, list:
      (r3v2 com.yalla.yalla.ui.dialog.RoomVoteDialog$VoteStatus[]) from 0x001f: INVOKE (r3v2 com.yalla.yalla.ui.dialog.RoomVoteDialog$VoteStatus[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:32)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomVoteDialog$VoteStatus;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "Running", "Ended", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class VoteStatus {
        Running(0),
        Ended(10);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(voteStatusArr);
        }

        public VoteStatus(int i) {
            super(str, i);
            this.value = i;
        }

        public static VoteStatus valueOf(String str) {
            return (VoteStatus) Enum.valueOf(VoteStatus.class, str);
        }

        public static VoteStatus[] values() {
            return (VoteStatus[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomVoteDialog(@NotNull FragmentActivity context, @NotNull oOo00OO0.OooOOO dismissListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        this.f27493OooOO0O = dismissListener;
        w wVarInflate = w.inflate(LayoutInflater.from(context), this.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(wVarInflate, "inflate(...)");
        this.f27494OooOO0o = wVarInflate;
        this.f27495OooOOO = true;
        wVarInflate.f45644OooO0OO.setOnClickListener(this);
        wVarInflate.f45643OooO0O0.setOnClickListener(this);
        wVarInflate.f45649OooO0oo.setOnClickListener(this);
        int i = oo0o0Oo.room_item_vote_game_dialog;
        Context context2 = this.f58507OooO0Oo;
        l2 l2Var = new l2(this, context2, i);
        this.f27496OooOOO0 = l2Var;
        l2Var.f13179OooO0oo = new o000O00O.oo0o0Oo(this);
        l2Var.f13176OooO0o = new o0O0O00(this);
        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = new MaxHeightLinearLayoutManager(context2);
        this.f27498OooOOOo = maxHeightLinearLayoutManager;
        RecyclerView recyclerView = wVarInflate.f45646OooO0o;
        recyclerView.setLayoutManager(maxHeightLinearLayoutManager);
        l2 l2Var2 = this.f27496OooOOO0;
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
            strOooO0O0 = android.support.v4.media.session.OooO0OO.OooO0O0(j5 >= 10 ? new StringBuilder() : new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO), j5, CertificateUtil.DELIMITER);
        } else if (j5 >= 10) {
            strOooO0O0 = j5 + CertificateUtil.DELIMITER;
        } else {
            if (1 <= j5 && j5 < 10) {
                strOooO0O0 = AppEventsConstants.EVENT_PARAM_VALUE_NO + j5 + CertificateUtil.DELIMITER;
            } else {
                strOooO0O0 = "";
            }
        }
        return o0OoOo0.OooO0O0(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0O0, j6 >= 10 ? String.valueOf(j6) : androidx.compose.ui.input.key.OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, j6)), CertificateUtil.DELIMITER, j7 >= 10 ? String.valueOf(j7) : androidx.compose.ui.input.key.OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, j7));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0Oo() {
        this.f27494OooOO0o.f45648OooO0oO.clearAnimation();
        this.f27493OooOO0O.invoke();
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        w wVar = this.f27494OooOO0o;
        boolean zAreEqual = Intrinsics.areEqual(view, wVar.f45644OooO0OO);
        Context context = this.f58507OooO0Oo;
        if (!zAreEqual) {
            if (!Intrinsics.areEqual(view, wVar.f45649OooO0oo)) {
                OooO0O0();
                return;
            }
            o000O o000o = new o000O(context);
            o000o.OooOo00(o0000.OooO0OO(o000000.room_vote_game_end_up_dialog_content));
            o000o.OooOo(true);
            o000o.OooOOOo(o0000.OooO0OO(o000000.room_vote_game_end_up_dialog_confirm));
            o000o.OooOo0(new k2(this));
            o000o.OooOO0o();
            return;
        }
        final o000OO00 o000oo01 = new o000OO00(context, 0);
        y yVarInflate = y.inflate(LayoutInflater.from(o000oo01.f58507OooO0Oo), o000oo01.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(yVarInflate, "inflate(...)");
        Window window = o000oo01.f58510OooO0oO;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(o000000O.anim_bottom_top_bottom);
            window.setGravity(80);
        }
        yVarInflate.f45691OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o000OO00 this_apply = o000oo01;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
            }
        });
        o000oo01.OooO();
    }

    public final void OooOO0() {
        CountDownTimer countDownTimer = this.f27500OooOOo0;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
        }
        CountDownTimer countDownTimer2 = this.f27500OooOOo0;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.f27500OooOOo0 = null;
    }

    public final void OooOO0O(boolean z) {
        w wVar = this.f27494OooOO0o;
        if (!z) {
            SVGAView svgaView = wVar.f45648OooO0oO;
            Intrinsics.checkNotNullExpressionValue(svgaView, "svgaView");
            com.code.android.util.o000O.OooO0O0(svgaView);
            return;
        }
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        RoomGameConfig.Vote value = oooO00o.OooO00o().f24575Oooo0oO.getValue();
        if (value != null && this.f27499OooOOo == value.getVoteId()) {
            return;
        }
        RoomGameConfig.Vote value2 = oooO00o.OooO00o().f24575Oooo0oO.getValue();
        this.f27499OooOOo = value2 != null ? value2.getVoteId() : 0L;
        wVar.f45648OooO0oO.setLoops(1);
        Context context = this.f58507OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        SVGAView svgaView2 = wVar.f45648OooO0oO;
        svgaView2.OooOO0O("svga/room_vote_game_finish.svga", (FragmentActivity) context);
        svgaView2.OooOO0o();
        Intrinsics.checkNotNullExpressionValue(svgaView2, "svgaView");
        com.code.android.util.o000O.OooOOOO(svgaView2);
    }
}
