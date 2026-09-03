package p552o0oOOoOo;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
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
import p023Oooo00o.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0OO0o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f55969OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f55970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomRunWayItemView f55971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Function1<? super Boolean, Unit> f55972OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f55973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomRunWayModel> f55974OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f55975OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public ExecutorService f55976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f55977OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f55978OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f55979OooOO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO0o00.OooO00o(o0OO0o00.this);
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
            o0OO0o00 o0oo0o01 = o0OO0o00.this;
            int i2 = o0oo0o01.f55977OooO0oo;
            RoomRunWayItemView roomRunWayItemView = o0oo0o01.f55971OooO0O0;
            if (i == i2) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                roomRunWayItemView.OooO0O0(((Integer) obj).intValue());
            } else if (i == o0oo0o01.f55969OooO) {
                o0OOooO0 o0ooooo0 = roomRunWayItemView.roomGiftRunWayAnima;
                if (o0ooooo0 != null) {
                    ConstraintLayout constraintLayout = roomRunWayItemView.f31058OooO0Oo.f59354OooO0oO;
                    Object value = o0ooooo0.f55992OooO0O0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-layoutAnimationOut>(...)");
                    constraintLayout.startAnimation((Animation) value);
                }
                o0oo0o01.f55975OooO0o0 = false;
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0OOooO0> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOooO0 invoke() {
            o0OO0o00 o0oo0o01 = o0OO0o00.this;
            o0OOooO0 o0ooooo0 = new o0OOooO0(o0oo0o01.f55970OooO00o);
            Object value = o0ooooo0.f55991OooO00o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-layoutAnimationIn>(...)");
            ((Animation) value).setAnimationListener(new o0OO0o(o0oo0o01));
            Object value2 = o0ooooo0.f55992OooO0O0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "<get-layoutAnimationOut>(...)");
            ((Animation) value2).setAnimationListener(new o0OO0oO0(o0oo0o01));
            return o0ooooo0;
        }
    }

    public o0OO0o00(@NotNull MixedRoomActivity activity, @NotNull RoomRunWayItemView itemView, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f55970OooO00o = activity;
        this.f55971OooO0O0 = itemView;
        this.f55972OooO0OO = function1;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f55973OooO0Oo = lazy;
        this.f55974OooO0o = new ArrayList<>();
        itemView.setRoomGiftRunWayAnima((o0OOooO0) lazy.getValue());
        itemView.setBgAnimationUiInitListener(new OooO00o());
        this.f55977OooO0oo = 100;
        this.f55969OooO = 101;
        this.f55978OooOO0 = new OooO0O0();
    }

    public static final void OooO00o(o0OO0o00 o0oo0o01) {
        ArrayList<RoomRunWayModel> arrayList = o0oo0o01.f55974OooO0o;
        if (arrayList.size() > 0) {
            RoomRunWayModel roomRunWayModel = arrayList.get(0);
            ExecutorService executorService = o0oo0o01.f55976OooO0oO;
            if (executorService == null || roomRunWayModel == null) {
                return;
            }
            o0oo0o01.f55979OooOO0O = true;
            executorService.execute(new oOo00OO0(1, roomRunWayModel, o0oo0o01));
        }
    }

    public final void OooO0O0(@NotNull RoomRunWayModel roomRunWayModel) {
        Intrinsics.checkNotNullParameter(roomRunWayModel, "roomRunWayModel");
        ArrayList<RoomRunWayModel> arrayList = this.f55974OooO0o;
        arrayList.add(roomRunWayModel);
        if (arrayList.size() != 1 || this.f55975OooO0o0) {
            return;
        }
        RoomRunWayModel roomRunWayModel2 = arrayList.get(0);
        try {
            this.f55975OooO0o0 = true;
            Function1<? super Boolean, Unit> function1 = this.f55972OooO0OO;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.f55971OooO0O0.setData(roomRunWayModel2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0OO() {
        int i = this.f55977OooO0oo;
        OooO0O0 oooO0O0 = this.f55978OooOO0;
        oooO0O0.removeMessages(i);
        oooO0O0.removeMessages(this.f55969OooO);
        this.f55974OooO0o.clear();
        this.f55979OooOO0O = false;
        this.f55975OooO0o0 = false;
        RoomRunWayItemView roomRunWayItemView = this.f55971OooO0O0;
        roomRunWayItemView.clearAnimation();
        o000OO00.OooO0O0(roomRunWayItemView);
    }
}
