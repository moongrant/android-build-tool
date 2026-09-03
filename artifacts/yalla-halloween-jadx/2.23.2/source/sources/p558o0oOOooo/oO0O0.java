package p558o0oOOooo;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00o.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f56185OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f56186OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomRunWayItemView f56187OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Function1<? super Boolean, Unit> f56188OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f56189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomRunWayModel> f56190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f56191OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public ExecutorService f56192OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f56193OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f56194OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f56195OooOO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O0.OooO00o(oO0O0.this);
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public static final class OooO0O0 extends Handler {
        public OooO0O0() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            int i = msg.what;
            oO0O0 oo0o0 = oO0O0.this;
            int i2 = oo0o0.f56193OooO0oo;
            RoomRunWayItemView roomRunWayItemView = oo0o0.f56187OooO0O0;
            if (i == i2) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                roomRunWayItemView.OooO0O0(((Integer) obj).intValue());
            } else if (i == oo0o0.f56185OooO) {
                oO0O00oO oo0o00oo = roomRunWayItemView.roomGiftRunWayAnima;
                if (oo0o00oo != null) {
                    ConstraintLayout constraintLayout = roomRunWayItemView.f30513OooO0Oo.f44172OooO0oO;
                    Object value = oo0o00oo.f56215OooO0O0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    constraintLayout.startAnimation((Animation) value);
                }
                oo0o0.f56191OooO0o0 = false;
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oO0O00oO> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O00oO invoke() {
            oO0O0 oo0o0 = oO0O0.this;
            oO0O00oO oo0o00oo = new oO0O00oO(oo0o0.f56186OooO00o);
            Object value = oo0o00oo.f56214OooO00o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Animation) value).setAnimationListener(new oO0O0O00(oo0o0));
            Object value2 = oo0o00oo.f56215OooO0O0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((Animation) value2).setAnimationListener(new oO0O0O0o(oo0o0));
            return oo0o00oo;
        }
    }

    public oO0O0(@NotNull MixedRoomActivity activity, @NotNull RoomRunWayItemView itemView, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f56186OooO00o = activity;
        this.f56187OooO0O0 = itemView;
        this.f56188OooO0OO = function1;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f56189OooO0Oo = lazy;
        this.f56190OooO0o = new ArrayList<>();
        itemView.setRoomGiftRunWayAnima((oO0O00oO) lazy.getValue());
        itemView.setBgAnimationUiInitListener(new OooO00o());
        this.f56193OooO0oo = 100;
        this.f56185OooO = 101;
        this.f56194OooOO0 = new OooO0O0();
    }

    public static final void OooO00o(oO0O0 oo0o0) {
        ArrayList<RoomRunWayModel> arrayList = oo0o0.f56190OooO0o;
        if (arrayList.size() > 0) {
            RoomRunWayModel roomRunWayModel = arrayList.get(0);
            ExecutorService executorService = oo0o0.f56192OooO0oO;
            if (executorService == null || roomRunWayModel == null) {
                return;
            }
            oo0o0.f56195OooOO0O = true;
            executorService.execute(new oO00O0o(2, roomRunWayModel, oo0o0));
        }
    }

    public final void OooO0O0(@NotNull RoomRunWayModel roomRunWayModel) {
        Intrinsics.checkNotNullParameter(roomRunWayModel, "roomRunWayModel");
        ArrayList<RoomRunWayModel> arrayList = this.f56190OooO0o;
        arrayList.add(roomRunWayModel);
        if (arrayList.size() != 1 || this.f56191OooO0o0) {
            return;
        }
        RoomRunWayModel roomRunWayModel2 = arrayList.get(0);
        try {
            this.f56191OooO0o0 = true;
            Function1<? super Boolean, Unit> function1 = this.f56188OooO0OO;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.f56187OooO0O0.setData(roomRunWayModel2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0OO() {
        int i = this.f56193OooO0oo;
        OooO0O0 oooO0O0 = this.f56194OooOO0;
        oooO0O0.removeMessages(i);
        oooO0O0.removeMessages(this.f56185OooO);
        this.f56190OooO0o.clear();
        this.f56195OooOO0O = false;
        this.f56191OooO0o0 = false;
        RoomRunWayItemView roomRunWayItemView = this.f56187OooO0O0;
        roomRunWayItemView.clearAnimation();
        o000O.OooO0O0(roomRunWayItemView);
    }
}
