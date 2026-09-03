package p499o0o00o;

import android.graphics.Path;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomPKResultModel;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.i1;
import p495o0o00Oo.OooOO0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f50050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f50051OooO0OO;

    public static final class OooO00o extends Lambda implements Function1<RoomPKResultModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomPKResultModel roomPKResultModel) {
            RoomPKResultModel roomPKResultModel2 = roomPKResultModel;
            oO0Oo oo0oo = oO0Oo.this;
            if (roomPKResultModel2 != null) {
                oo0oo.f50051OooO0OO = true;
                ConstraintLayout constraintLayout = oo0oo.OooO0OO().f43940OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000O.OooOOOO(constraintLayout);
                oo0oo.OooO0OO().f43956OooOOo0.setText("(" + (roomPKResultModel2.getPk_time_duration() / 60) + o0000.OooO0OO(o000000.room_pk_minute) + ")");
                MixedRoomActivity mixedRoomActivity = oo0oo.f49626OooO00o;
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o.f43126OooO0OO = roomPKResultModel2.getRoom_a_picurl();
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0o(4, 0, 4, 0);
                oooO00o.f43151OooOoo0 = 2;
                oooO00o.OooO0Oo(oo0oo.OooO0OO().f43949OooOO0O);
                oo0oo.OooO0OO().f43951OooOOO.setText(roomPKResultModel2.getRoom_a_name());
                Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o2.f43130OooO0oO = o0Oo0oo.room_ic_pk_name_bg_left;
                oooO00o2.f43124OooO00o = 1;
                oooO00o2.OooO0o(0, 0, 4, 0);
                oooO00o2.OooO0Oo(oo0oo.OooO0OO().f43943OooO0Oo);
                Path path = new Path();
                path.moveTo(o0000O0.OooO00o(13), 0.0f);
                float f = 66;
                path.lineTo(o0000O0.OooO00o(f), 0.0f);
                float f2 = 40;
                path.lineTo(o0000O0.OooO00o(f), o0000O0.OooO00o(f2));
                path.lineTo(0.0f, o0000O0.OooO00o(f2));
                path.lineTo(o0000O0.OooO00o(15), 0.0f);
                oo0oo.OooO0OO().f43950OooOO0o.setClipPath(path);
                Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o3.f43130OooO0oO = o0Oo0oo.room_ic_pk_name_bg_right;
                oooO00o3.f43124OooO00o = 1;
                oooO00o3.OooO0o(0, 0, 0, 4);
                oooO00o3.OooO0Oo(oo0oo.OooO0OO().f43945OooO0o0);
                oo0oo.OooO0OO().f43955OooOOo.setText(roomPKResultModel2.getRoom_b_name());
                Oooo000.OooO00o oooO00o4 = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o4.f43126OooO0OO = roomPKResultModel2.getRoom_b_picurl();
                oooO00o4.f43124OooO00o = 0;
                oooO00o4.OooO0o(0, 4, 0, 4);
                oooO00o4.f43151OooOoo0 = 2;
                oooO00o4.OooO0Oo(oo0oo.OooO0OO().f43950OooOO0o);
                if (roomPKResultModel2.getRoom_a_giftnumber() > roomPKResultModel2.getRoom_b_giftnumber()) {
                    ImageView ivWinBlue = oo0oo.OooO0OO().f43946OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(ivWinBlue, "ivWinBlue");
                    o000O.OooOOOO(ivWinBlue);
                    ImageView ivWinRed = oo0oo.OooO0OO().f43947OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(ivWinRed, "ivWinRed");
                    o000O.OooO0O0(ivWinRed);
                } else if (roomPKResultModel2.getRoom_a_giftnumber() < roomPKResultModel2.getRoom_b_giftnumber()) {
                    ImageView ivWinBlue2 = oo0oo.OooO0OO().f43946OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(ivWinBlue2, "ivWinBlue");
                    o000O.OooO0O0(ivWinBlue2);
                    ImageView ivWinRed2 = oo0oo.OooO0OO().f43947OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(ivWinRed2, "ivWinRed");
                    o000O.OooOOOO(ivWinRed2);
                } else {
                    ImageView ivWinBlue3 = oo0oo.OooO0OO().f43946OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(ivWinBlue3, "ivWinBlue");
                    o000O.OooO0O0(ivWinBlue3);
                    ImageView ivWinRed3 = oo0oo.OooO0OO().f43947OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(ivWinRed3, "ivWinRed");
                    o000O.OooO0O0(ivWinRed3);
                }
                oo0oo.OooO0OO().f43953OooOOOO.setText(String.valueOf(roomPKResultModel2.getRoom_a_giftnumber()));
                oo0oo.OooO0OO().f43954OooOOOo.setText(String.valueOf(roomPKResultModel2.getRoom_b_giftnumber()));
                Oooo000.OooO00o oooO00o5 = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o5.f43126OooO0OO = roomPKResultModel2.getGift_picurl();
                oooO00o5.f43124OooO00o = 0;
                oooO00o5.OooO00o(d1.OooO0O0());
                oooO00o5.OooO0Oo(oo0oo.OooO0OO().f43939OooO);
                Oooo000.OooO00o oooO00o6 = new Oooo000.OooO00o(mixedRoomActivity);
                oooO00o6.f43126OooO0OO = roomPKResultModel2.getGift_picurl();
                oooO00o6.f43124OooO00o = 0;
                oooO00o6.OooO00o(d1.OooO0O0());
                oooO00o6.OooO0Oo(oo0oo.OooO0OO().f43948OooOO0);
                oo0oo.OooO0OO().f43952OooOOO0.setProgress(Math.min(Math.max((int) ((((double) roomPKResultModel2.getRoom_a_giftnumber()) / ((double) (roomPKResultModel2.getRoom_b_giftnumber() + roomPKResultModel2.getRoom_b_giftnumber()))) * ((double) 100)), 10), 90));
            } else if (oo0oo.f50051OooO0OO) {
                ConstraintLayout constraintLayout2 = oo0oo.OooO0OO().f43940OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                o000O.OooO0O0(constraintLayout2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<i1> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final i1 invoke() {
            i1 i1VarOooO00o = i1.OooO00o(((ViewStub) oO0Oo.this.f49626OooO00o.findViewById(o0OO00O.vsPK)).inflate());
            i1VarOooO00o.f43952OooOOO0.setEnabled(false);
            i1VarOooO00o.f43940OooO00o.setOnClickListener(new p185o00o00Oo.o0000O0());
            i1VarOooO00o.f43950OooOO0o.setOnClickListener(new o0oo0000());
            i1VarOooO00o.f43944OooO0o.setOnClickListener(new ooo0Oo0());
            Intrinsics.checkNotNullExpressionValue(i1VarOooO00o, "also(...)");
            return i1VarOooO00o;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f50054OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50054OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f50054OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50054OooO0Oo;
        }

        public final int hashCode() {
            return this.f50054OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50054OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f50050OooO0O0 = LazyKt.lazy(new OooO0O0());
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24566Oooo.observe(this.f49626OooO00o, new OooO0OO(new OooO00o()));
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        if (this.f50051OooO0OO) {
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24566Oooo.postValue(null);
        }
    }

    public final i1 OooO0OO() {
        return (i1) this.f50050OooO0O0.getValue();
    }
}
