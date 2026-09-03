package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.app.base.protobuf.room.Room;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.room.VoteGameVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p143o00OOooo.o00O0O0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.o00O0;
import p255o00ooO0o.o00O00o0;
import p255o00ooO0o.oo0oOO0;
import p470o0Oooo0.o00O000;
import p502o0o00o0.o00000O;
import p544o0o0OoOO.h7;
import p544o0o0OoOO.j7;
import p544o0o0OoOO.n7;
import p544o0o0OoOO.o7;
import p544o0o0OoOO.p7;
import p544o0o0OoOO.q7;
import p544o0o0OoOO.r7;
import p544o0o0OoOO.s7;
import p649o0ooOOoo.tf;
import p649o0ooOOoo.vf;
import p649o0ooOOoo.ye;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Period", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VoteGameCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23073OooooOo = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23074OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ye.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<RoomUserInfoModel> f23075Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f23076Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public VoteGameGift f23077OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public Period f23078OooooOO;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.values().length];
            iArr[Period.FiveMin.ordinal()] = 1;
            iArr[Period.TenMin.ordinal()] = 2;
            iArr[Period.ThirtyMin.ordinal()] = 3;
            iArr[Period.SixtyMin.ordinal()] = 4;
            iArr[Period.Infinite.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity$Period;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "FiveMin", "TenMin", "ThirtyMin", "SixtyMin", "Infinite", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum Period {
        FiveMin(1),
        TenMin(2),
        ThirtyMin(3),
        SixtyMin(4),
        Infinite(100);

        private final int value;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Period.values().length];
                iArr[Period.FiveMin.ordinal()] = 1;
                iArr[Period.TenMin.ordinal()] = 2;
                iArr[Period.ThirtyMin.ordinal()] = 3;
                iArr[Period.SixtyMin.ordinal()] = 4;
                iArr[Period.Infinite.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Period(int i) {
            this.value = i;
        }
    }

    public VoteGameCreateActivity() {
        new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteGameVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23081Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23081Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f23076Ooooo0o = new ArrayList();
        this.f23078OooooOO = Period.FiveMin;
    }

    public final ye OooOoo() {
        return (ye) this.f23074OoooOoo.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void OooOooO() {
        p188o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO = null;
        if (this.f23076Ooooo0o.size() >= 20) {
            p188o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO2 = this.f23075Ooooo00;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.setNewData(this.f23076Ooooo0o);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f23076Ooooo0o);
        arrayList.add(new RoomUserInfoModel());
        p188o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO3 = this.f23075Ooooo00;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO3;
        }
        oooO0OO.setNewData(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Room.InitiateVoteRequest.DurationType durationType;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int i = 0;
        if (Intrinsics.areEqual(view, OooOoo().f51032OooO0o)) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(this);
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_vote_game_dialog_set_title));
            oo0ooo0.OooOooo();
            oo0ooo0.OooO0oO(false);
            final vf vfVarInflate = vf.inflate(LayoutInflater.from(oo0ooo0.f34199OooO00o), oo0ooo0.f34201OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(vfVarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            vfVarInflate.f50817OooO0O0.setText(OooOoo().f51027OooO.getText());
            vfVarInflate.f50817OooO0O0.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(60)});
            EditText editText = vfVarInflate.f50817OooO0O0;
            o0o00o00.OooOO0.OooO00o oooO00o = p503o0o00o00.OooOO0.f41606Oooo0o;
            p503o0o00o00.OooOO0 oooOO1 = p503o0o00o00.OooOO0.f41605Oooo;
            if (oooOO1 == null) {
                oooOO1 = new p503o0o00o00.OooOO0();
                p503o0o00o00.OooOO0.f41605Oooo = oooOO1;
            }
            editText.setTransformationMethod(oooOO1);
            vfVarInflate.f50818OooO0OO.setText(vfVarInflate.f50817OooO0O0.getText().toString().length() + "/60");
            vfVarInflate.f50817OooO0O0.setSelection(OooOoo().f51027OooO.getText().length());
            EditText editText2 = vfVarInflate.f50817OooO0O0;
            Intrinsics.checkNotNullExpressionValue(editText2, "dialogBinding.etVoteSetTitle");
            editText2.addTextChangedListener(new s7(vfVarInflate));
            vfVarInflate.f50817OooO0O0.postDelayed(new Runnable() { // from class: o0o0OoOO.g7
                @Override // java.lang.Runnable
                public final void run() {
                    vf dialogBinding = vfVarInflate;
                    VoteGameCreateActivity.OooO00o oooO00o2 = VoteGameCreateActivity.f23073OooooOo;
                    Intrinsics.checkNotNullParameter(dialogBinding, "$dialogBinding");
                    EditText view2 = dialogBinding.f50817OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(view2, "dialogBinding.etVoteSetTitle");
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                    view2.setFocusable(true);
                    view2.setFocusableInTouchMode(true);
                    view2.requestFocus();
                    inputMethodManagerOooO00o.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view2, "view.context"), new Handler()));
                }
            }, 50L);
            LinearLayoutCompat linearLayoutCompat = vfVarInflate.f50816OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "dialogBinding.root");
            oo0ooo0.OooOo00(linearLayoutCompat);
            oo0ooo0.f34372OooO0oO = false;
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.room_vote_game_save_title));
            oo0ooo0.OooOo0o(new q7(vfVarInflate, this, oo0ooo0));
            oo0ooo0.OooOO0O(new r7(vfVarInflate));
            oo0ooo0.OooOOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f51031OooO0Oo)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            VoteGameGift voteGameGift = this.f23077OooooO0;
            objectRef.element = voteGameGift != null ? voteGameGift.clone() : 0;
            o00000O o00000o = new o00000O(this, 0);
            Context context = o00000o.f41543Oooo0o;
            p518o0o0O00o.o00O000 o00o001 = p518o0o0O00o.o00O000.f42199OooO00o;
            n7 n7Var = new n7(objectRef, context, p518o0o0O00o.o00O000.f42200OooO0O0.getValue());
            tf tfVarInflate = tf.inflate(LayoutInflater.from(o00000o.f41543Oooo0o), o00000o.f41545Oooo0oo, false);
            new o000OOo().attachToRecyclerView(tfVarInflate.f50663OooO0O0);
            tfVarInflate.f50663OooO0O0.setLayoutManager(new FixLinearLayoutManager(o00000o.f41543Oooo0o, 0));
            tfVarInflate.f50663OooO0O0.setAdapter(n7Var);
            tfVarInflate.f50664OooO0OO.setOnClickListener(new o7(o00000o, this, objectRef));
            Intrinsics.checkNotNullExpressionValue(tfVarInflate, "inflate(LayoutInflater.f…     })\n                }");
            LinearLayoutCompat linearLayoutCompat2 = tfVarInflate.f50662OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "dialogBinding.root");
            o00000o.OooO0oO(linearLayoutCompat2);
            Window window = o00000o.f41544Oooo0oO.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = o00000o.f41544Oooo0oO.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.anim_bottom_top_bottom);
            }
            o00000o.OooOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f51033OooO0o0)) {
            List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(R.string.room_vote_game_first_period), getString(R.string.room_vote_game_second_period), getString(R.string.room_vote_game_third_period), getString(R.string.room_vote_game_fourth_period), getString(R.string.room_vote_game_not_period)});
            int i2 = OooO0O0.$EnumSwitchMapping$0[this.f23078OooooOO.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                } else if (i2 == 4) {
                    i = 3;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 4;
                }
            }
            o00O0 o00o1 = new o00O0(this);
            o00o1.OooOOo(listListOf);
            o00o1.f34362OooOO0O = Integer.valueOf(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9));
            int i3 = o00o1.f34361OooOO0;
            o00o1.f34361OooOO0 = i;
            o00o1.f34358OooO.notifyItemChanged(i3);
            o00o1.f34358OooO.notifyItemChanged(o00o1.f34361OooOO0);
            p7 onItemClick = new p7(this, listListOf);
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            o00o1.f34358OooO.setOnItemClickListener(new o00O00o0(o00o1, onItemClick));
            o00o1.OooOOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f51029OooO0O0)) {
            if (this.f23076Ooooo0o.size() < 2) {
                String strOooO0OO = o000O0O0.OooO0OO(R.string.room_vote_game_less_select_two_user);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    p254o00ooO0O.o00O000 o00o002 = p254o00ooO0O.o00O000.f34346OooO00o;
                    p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            String string = OooOoo().f51027OooO.getText().toString();
            if (StringsKt.trim((CharSequence) string).toString().length() == 0) {
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.room_vote_game_create_title_is_empty);
                ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                    return;
                } else {
                    p254o00ooO0O.o00O000 o00o003 = p254o00ooO0O.o00O000.f34346OooO00o;
                    p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f23076Ooooo0o.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((RoomUserInfoModel) it.next()).getUserId()));
            }
            p159o00OoOO.o00O000 o00o000OooO = p159o00OoOO.o00O000.OooO();
            VoteGameGift voteGameGift2 = this.f23077OooooO0;
            Long lValueOf = voteGameGift2 != null ? Long.valueOf(voteGameGift2.getGiftId()) : null;
            Period period = this.f23078OooooOO;
            Objects.requireNonNull(period);
            int i4 = Period.OooO00o.$EnumSwitchMapping$0[period.ordinal()];
            if (i4 == 1) {
                durationType = Room.InitiateVoteRequest.DurationType.FiveMin;
            } else if (i4 == 2) {
                durationType = Room.InitiateVoteRequest.DurationType.TenMin;
            } else if (i4 == 3) {
                durationType = Room.InitiateVoteRequest.DurationType.ThirtyMin;
            } else if (i4 == 4) {
                durationType = Room.InitiateVoteRequest.DurationType.SixtyMin;
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                durationType = Room.InitiateVoteRequest.DurationType.Infinite;
            }
            Objects.requireNonNull(o00o000OooO);
            if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                Room.InitiateVoteRequest.Builder builderNewBuilder = Room.InitiateVoteRequest.newBuilder();
                builderNewBuilder.addAllUserIds(arrayList);
                builderNewBuilder.setTitle(string);
                builderNewBuilder.setGiftId(lValueOf.longValue());
                builderNewBuilder.setDurationType(durationType);
                p159o00OoOO.o00O000.f32468OooO00o.OooO0oO(1100000, builderNewBuilder.build().toByteArray());
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f51028OooO00o);
        OooOo(R.string.room_vote_game_page_title);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.OooOoOO(R.drawable.room_vote_game_page_menu, new h7(this));
        }
        OooOoo().f51032OooO0o.setOnClickListener(this);
        OooOoo().f51035OooO0oo.setText(o000O0O0.OooO0OO(R.string.room_vote_game_first_period));
        OooOoo().f51033OooO0o0.setOnClickListener(this);
        OooOoo().f51029OooO0O0.setOnClickListener(this);
        j7 j7Var = new j7(this);
        this.f23075Ooooo00 = j7Var;
        int i = 5;
        j7Var.setOnItemClickListener(new com.facebook.appevents.ml.OooO(this, 5));
        OooOoo().f51034OooO0oO.setLayoutManager(new FixGridLayoutManager(this, 5));
        RecyclerView recyclerView = OooOoo().f51034OooO0oO;
        p188o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO = this.f23075Ooooo00;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        OooOooO();
        p518o0o0O00o.o00O000 o00o001 = p518o0o0O00o.o00O000.f42199OooO00o;
        p518o0o0O00o.o00O000.f42200OooO0O0.observe(this, new o00O0O0O(this, i));
        LiveEventBus.get("INITIATE_VOTE_REQUEST").observe(this, new o00OOO00.OooO00o(this, 4));
    }
}
