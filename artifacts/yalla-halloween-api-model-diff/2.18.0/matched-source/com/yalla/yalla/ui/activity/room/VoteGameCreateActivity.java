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
import androidx.recyclerview.widget.o000000;
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
import p144o00OOooo.o00O0O0O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.o00O0;
import p256o00ooO0o.o00O00o0;
import p256o00ooO0o.oo0oOO0;
import p472o0Oooo0.o00O000;
import p504o0o00o0.o00000O;
import p520o0o0O00o.o00oOoo;
import p546o0o0OoOO.g7;
import p546o0o0OoOO.i7;
import p546o0o0OoOO.m7;
import p546o0o0OoOO.n7;
import p546o0o0OoOO.o7;
import p546o0o0OoOO.p7;
import p546o0o0OoOO.q7;
import p546o0o0OoOO.r7;
import p651o0ooOOoo.sf;
import p651o0ooOOoo.uf;
import p651o0ooOOoo.xe;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Period", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VoteGameCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23092OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f23093OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(xe.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public p189o00o00o0.OooO0OO<RoomUserInfoModel> f23094OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f23095OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public Period f23096Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public VoteGameGift f23097Oooooo0;

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

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function0 f23100Oooo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23100Oooo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f23095OooooOo = new ArrayList();
        this.f23096Oooooo = Period.FiveMin;
    }

    public final xe OooOoo() {
        return (xe) this.f23093OooooO0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void OooOooO() {
        p189o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO = null;
        if (this.f23095OooooOo.size() >= 20) {
            p189o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO2 = this.f23094OooooOO;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.setNewData(this.f23095OooooOo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f23095OooooOo);
        arrayList.add(new RoomUserInfoModel());
        p189o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO3 = this.f23094OooooOO;
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
        if (Intrinsics.areEqual(view, OooOoo().f50969OooO0o)) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(this);
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_vote_game_dialog_set_title));
            oo0ooo0.OooOooo();
            oo0ooo0.OooO0oO(false);
            final uf ufVarInflate = uf.inflate(LayoutInflater.from(oo0ooo0.f34221OooO00o), oo0ooo0.f34223OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(ufVarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            ufVarInflate.f50754OooO0O0.setText(OooOoo().f50964OooO.getText());
            ufVarInflate.f50754OooO0O0.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(60)});
            EditText editText = ufVarInflate.f50754OooO0O0;
            o0o00o00.OooOO0.OooO00o oooO00o = p505o0o00o00.OooOO0.f41624Oooo;
            p505o0o00o00.OooOO0 oooOO1 = p505o0o00o00.OooOO0.f41627OoooO0O;
            if (oooOO1 == null) {
                oooOO1 = new p505o0o00o00.OooOO0();
                p505o0o00o00.OooOO0.f41627OoooO0O = oooOO1;
            }
            editText.setTransformationMethod(oooOO1);
            ufVarInflate.f50755OooO0OO.setText(ufVarInflate.f50754OooO0O0.getText().toString().length() + "/60");
            ufVarInflate.f50754OooO0O0.setSelection(OooOoo().f50964OooO.getText().length());
            EditText editText2 = ufVarInflate.f50754OooO0O0;
            Intrinsics.checkNotNullExpressionValue(editText2, "dialogBinding.etVoteSetTitle");
            editText2.addTextChangedListener(new r7(ufVarInflate));
            ufVarInflate.f50754OooO0O0.postDelayed(new Runnable() { // from class: o0o0OoOO.f7
                @Override // java.lang.Runnable
                public final void run() {
                    uf dialogBinding = ufVarInflate;
                    VoteGameCreateActivity.OooO00o oooO00o2 = VoteGameCreateActivity.f23092OoooooO;
                    Intrinsics.checkNotNullParameter(dialogBinding, "$dialogBinding");
                    EditText view2 = dialogBinding.f50754OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(view2, "dialogBinding.etVoteSetTitle");
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                    view2.setFocusable(true);
                    view2.setFocusableInTouchMode(true);
                    view2.requestFocus();
                    inputMethodManagerOooO00o.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view2, "view.context"), new Handler()));
                }
            }, 50L);
            LinearLayoutCompat linearLayoutCompat = ufVarInflate.f50753OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "dialogBinding.root");
            oo0ooo0.OooOo00(linearLayoutCompat);
            oo0ooo0.f34394OooO0oO = false;
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.room_vote_game_save_title));
            oo0ooo0.OooOo0o(new p7(ufVarInflate, this, oo0ooo0));
            oo0ooo0.OooOO0O(new q7(ufVarInflate));
            oo0ooo0.OooOOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50968OooO0Oo)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            VoteGameGift voteGameGift = this.f23097Oooooo0;
            objectRef.element = voteGameGift != null ? voteGameGift.clone() : 0;
            o00000O o00000o = new o00000O(this, 0);
            Context context = o00000o.f41561Oooo;
            o00oOoo o00oooo2 = o00oOoo.f42224OooO00o;
            m7 m7Var = new m7(objectRef, context, o00oOoo.f42225OooO0O0.getValue());
            sf sfVarInflate = sf.inflate(LayoutInflater.from(o00000o.f41561Oooo), o00000o.f41563OoooO0, false);
            new o000000().attachToRecyclerView(sfVarInflate.f50600OooO0O0);
            sfVarInflate.f50600OooO0O0.setLayoutManager(new FixLinearLayoutManager(o00000o.f41561Oooo, 0));
            sfVarInflate.f50600OooO0O0.setAdapter(m7Var);
            sfVarInflate.f50601OooO0OO.setOnClickListener(new n7(o00000o, this, objectRef));
            Intrinsics.checkNotNullExpressionValue(sfVarInflate, "inflate(LayoutInflater.f…     })\n                }");
            LinearLayoutCompat linearLayoutCompat2 = sfVarInflate.f50599OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "dialogBinding.root");
            o00000o.OooO0oO(linearLayoutCompat2);
            Window window = o00000o.f41564OoooO00.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = o00000o.f41564OoooO00.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.anim_bottom_top_bottom);
            }
            o00000o.OooOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50970OooO0o0)) {
            List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(R.string.room_vote_game_first_period), getString(R.string.room_vote_game_second_period), getString(R.string.room_vote_game_third_period), getString(R.string.room_vote_game_fourth_period), getString(R.string.room_vote_game_not_period)});
            int i2 = OooO0O0.$EnumSwitchMapping$0[this.f23096Oooooo.ordinal()];
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
            o00o1.f34384OooOO0O = Integer.valueOf(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9));
            int i3 = o00o1.f34383OooOO0;
            o00o1.f34383OooOO0 = i;
            o00o1.f34380OooO.notifyItemChanged(i3);
            o00o1.f34380OooO.notifyItemChanged(o00o1.f34383OooOO0);
            o7 onItemClick = new o7(this, listListOf);
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            o00o1.f34380OooO.setOnItemClickListener(new o00O00o0(o00o1, onItemClick));
            o00o1.OooOOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50966OooO0O0)) {
            if (this.f23095OooooOo.size() < 2) {
                String strOooO0OO = o000O0O0.OooO0OO(R.string.room_vote_game_less_select_two_user);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                    p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            String string = OooOoo().f50964OooO.getText().toString();
            if (StringsKt.trim((CharSequence) string).toString().length() == 0) {
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.room_vote_game_create_title_is_empty);
                ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                    return;
                } else {
                    p255o00ooO0O.o00O000 o00o002 = p255o00ooO0O.o00O000.f34368OooO00o;
                    p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f23095OooooOo.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((RoomUserInfoModel) it.next()).getUserId()));
            }
            p160o00OoOO.o00O000 o00o000OooO = p160o00OoOO.o00O000.OooO();
            VoteGameGift voteGameGift2 = this.f23097Oooooo0;
            Long lValueOf = voteGameGift2 != null ? Long.valueOf(voteGameGift2.getGiftId()) : null;
            Period period = this.f23096Oooooo;
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
            if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                Room.InitiateVoteRequest.Builder builderNewBuilder = Room.InitiateVoteRequest.newBuilder();
                builderNewBuilder.addAllUserIds(arrayList);
                builderNewBuilder.setTitle(string);
                builderNewBuilder.setGiftId(lValueOf.longValue());
                builderNewBuilder.setDurationType(durationType);
                p160o00OoOO.o00O000.f32490OooO00o.OooO0oO(1100000, builderNewBuilder.build().toByteArray());
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50965OooO00o);
        OooOo(R.string.room_vote_game_page_title);
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            headerLayout.OooOoOO(R.drawable.room_vote_game_page_menu, new g7(this));
        }
        OooOoo().f50969OooO0o.setOnClickListener(this);
        OooOoo().f50972OooO0oo.setText(o000O0O0.OooO0OO(R.string.room_vote_game_first_period));
        OooOoo().f50970OooO0o0.setOnClickListener(this);
        OooOoo().f50966OooO0O0.setOnClickListener(this);
        i7 i7Var = new i7(this);
        this.f23094OooooOO = i7Var;
        int i = 5;
        i7Var.setOnItemClickListener(new com.facebook.appevents.ml.OooO(this, 5));
        OooOoo().f50971OooO0oO.setLayoutManager(new FixGridLayoutManager(this, 5));
        RecyclerView recyclerView = OooOoo().f50971OooO0oO;
        p189o00o00o0.OooO0OO<RoomUserInfoModel> oooO0OO = this.f23094OooooOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        OooOooO();
        o00oOoo o00oooo2 = o00oOoo.f42224OooO00o;
        o00oOoo.f42225OooO0O0.observe(this, new o00O0O0O(this, i));
        LiveEventBus.get("INITIATE_VOTE_REQUEST").observe(this, new o00OOO00.OooO00o(this, 4));
    }
}
