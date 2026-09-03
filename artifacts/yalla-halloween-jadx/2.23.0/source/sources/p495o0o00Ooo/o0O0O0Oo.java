package p495o0o00Ooo;

import android.graphics.Path;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
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
import p362o0OOo0O.OooOO0;
import p489o0o00OO0.OooO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.t9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O0Oo extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f48825OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f48826OooO0OO;

    public static final class OooO00o extends Lambda implements Function1<RoomPKResultModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomPKResultModel roomPKResultModel) {
            RoomPKResultModel roomPKResultModel2 = roomPKResultModel;
            o0O0O0Oo o0o0o0oo = o0O0O0Oo.this;
            if (roomPKResultModel2 != null) {
                o0o0o0oo.f48826OooO0OO = true;
                ConstraintLayout constraintLayout = o0o0o0oo.OooO0OO().f58877OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                o000OO00.OooOOOO(constraintLayout);
                o0o0o0oo.OooO0OO().f58893OooOOo0.setText("(" + (roomPKResultModel2.getPk_time_duration() / 60) + o0000.OooO0OO(oO00OOo0.room_pk_minute) + ")");
                MixedRoomActivity mixedRoomActivity = o0o0o0oo.f48470OooO00o;
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o.f43911OooO0OO = roomPKResultModel2.getRoom_a_picurl();
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0o(4, 0, 4, 0);
                oooO00o.f43936OooOoo0 = 2;
                oooO00o.OooO0Oo(o0o0o0oo.OooO0OO().f58886OooOO0O);
                o0o0o0oo.OooO0OO().f58888OooOOO.setText(roomPKResultModel2.getRoom_a_name());
                OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o2.f43915OooO0oO = oOo00OO0.room_ic_pk_name_bg_left;
                oooO00o2.f43909OooO00o = 1;
                oooO00o2.OooO0o(0, 0, 4, 0);
                oooO00o2.OooO0Oo(o0o0o0oo.OooO0OO().f58880OooO0Oo);
                Path path = new Path();
                path.moveTo(o0000O0.OooO00o(13), 0.0f);
                float f = 66;
                path.lineTo(o0000O0.OooO00o(f), 0.0f);
                float f2 = 40;
                path.lineTo(o0000O0.OooO00o(f), o0000O0.OooO00o(f2));
                path.lineTo(0.0f, o0000O0.OooO00o(f2));
                path.lineTo(o0000O0.OooO00o(15), 0.0f);
                o0o0o0oo.OooO0OO().f58887OooOO0o.setClipPath(path);
                OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o3.f43915OooO0oO = oOo00OO0.room_ic_pk_name_bg_right;
                oooO00o3.f43909OooO00o = 1;
                oooO00o3.OooO0o(0, 0, 0, 4);
                oooO00o3.OooO0Oo(o0o0o0oo.OooO0OO().f58882OooO0o0);
                o0o0o0oo.OooO0OO().f58892OooOOo.setText(roomPKResultModel2.getRoom_b_name());
                OooOO0.OooO00o oooO00o4 = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o4.f43911OooO0OO = roomPKResultModel2.getRoom_b_picurl();
                oooO00o4.f43909OooO00o = 0;
                oooO00o4.OooO0o(0, 4, 0, 4);
                oooO00o4.f43936OooOoo0 = 2;
                oooO00o4.OooO0Oo(o0o0o0oo.OooO0OO().f58887OooOO0o);
                if (roomPKResultModel2.getRoom_a_giftnumber() > roomPKResultModel2.getRoom_b_giftnumber()) {
                    ImageView imageView = o0o0o0oo.OooO0OO().f58883OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWinBlue");
                    o000OO00.OooOOOO(imageView);
                    ImageView imageView2 = o0o0o0oo.OooO0OO().f58884OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWinRed");
                    o000OO00.OooO0O0(imageView2);
                } else if (roomPKResultModel2.getRoom_a_giftnumber() < roomPKResultModel2.getRoom_b_giftnumber()) {
                    ImageView imageView3 = o0o0o0oo.OooO0OO().f58883OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivWinBlue");
                    o000OO00.OooO0O0(imageView3);
                    ImageView imageView4 = o0o0o0oo.OooO0OO().f58884OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivWinRed");
                    o000OO00.OooOOOO(imageView4);
                } else {
                    ImageView imageView5 = o0o0o0oo.OooO0OO().f58883OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivWinBlue");
                    o000OO00.OooO0O0(imageView5);
                    ImageView imageView6 = o0o0o0oo.OooO0OO().f58884OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivWinRed");
                    o000OO00.OooO0O0(imageView6);
                }
                o0o0o0oo.OooO0OO().f58890OooOOOO.setText(String.valueOf(roomPKResultModel2.getRoom_a_giftnumber()));
                o0o0o0oo.OooO0OO().f58891OooOOOo.setText(String.valueOf(roomPKResultModel2.getRoom_b_giftnumber()));
                OooOO0.OooO00o oooO00o5 = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o5.f43911OooO0OO = roomPKResultModel2.getGift_picurl();
                oooO00o5.f43909OooO00o = 0;
                oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0O0());
                oooO00o5.OooO0Oo(o0o0o0oo.OooO0OO().f58876OooO);
                OooOO0.OooO00o oooO00o6 = new OooOO0.OooO00o(mixedRoomActivity);
                oooO00o6.f43911OooO0OO = roomPKResultModel2.getGift_picurl();
                oooO00o6.f43909OooO00o = 0;
                oooO00o6.OooO00o(p543o0oO0O00.OooO.OooO0O0());
                oooO00o6.OooO0Oo(o0o0o0oo.OooO0OO().f58885OooOO0);
                o0o0o0oo.OooO0OO().f58889OooOOO0.setProgress(Math.min(Math.max((int) ((((double) roomPKResultModel2.getRoom_a_giftnumber()) / ((double) (roomPKResultModel2.getRoom_b_giftnumber() + roomPKResultModel2.getRoom_b_giftnumber()))) * ((double) 100)), 10), 90));
            } else if (o0o0o0oo.f48826OooO0OO) {
                ConstraintLayout constraintLayout2 = o0o0o0oo.OooO0OO().f58877OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
                o000OO00.OooO0O0(constraintLayout2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<t9> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final t9 invoke() {
            t9 t9VarOooO00o = t9.OooO00o(((ViewStub) o0O0O0Oo.this.f48470OooO00o.findViewById(oO00O0oO.vsPK)).inflate());
            t9VarOooO00o.f58889OooOOO0.setEnabled(false);
            t9VarOooO00o.f58877OooO00o.setOnClickListener(new com.code.android.easydialog.OooOO0());
            t9VarOooO00o.f58887OooOO0o.setOnClickListener(new o0O0O0o0());
            t9VarOooO00o.f58881OooO0o.setOnClickListener(new o0O0OO0());
            Intrinsics.checkNotNullExpressionValue(t9VarOooO00o, "bind(clPK).also {\n      …stValue(null) }\n        }");
            return t9VarOooO00o;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f48829OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48829OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f48829OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f48829OooO0Oo;
        }

        public final int hashCode() {
            return this.f48829OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48829OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f48825OooO0O0 = LazyKt.lazy(new OooO0O0());
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25028Oooo.observe(this.f48470OooO00o, new OooO0OO(new OooO00o()));
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
        if (this.f48826OooO0OO) {
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25028Oooo.postValue(null);
        }
    }

    public final t9 OooO0OO() {
        return (t9) this.f48825OooO0O0.getValue();
    }
}
