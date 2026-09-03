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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.room.VoteGameVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p412o0Oo0oOo.t0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.j8;
import p641o0ooOOOO.l8;
import p641o0ooOOOO.o7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Period", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVoteGameCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n22#2,2:330\n75#3,13:332\n65#4,16:345\n93#4,3:361\n1#5:364\n*S KotlinDebug\n*F\n+ 1 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n*L\n59#1:330,2\n60#1:332,13\n177#1:345,16\n177#1:361,3\n*E\n"})
public final class VoteGameCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26755OooOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26756OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(o7.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26757OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public oo0oO0 f26758OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public VoteGameGift f26759OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public Period f26760OooOo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.values().length];
            try {
                iArr[Period.FiveMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.TenMin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.ThirtyMin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.SixtyMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Infinite.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26761OooO0Oo;

        public OooO0O0(o0O0oo00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26761OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26761OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26761OooO0Oo;
        }

        public final int hashCode() {
            return this.f26761OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26761OooO0Oo.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity$Period;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "FiveMin", "TenMin", "ThirtyMin", "SixtyMin", "Infinite", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
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
                try {
                    iArr[Period.FiveMin.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Period.TenMin.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Period.ThirtyMin.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Period.SixtyMin.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Period.Infinite.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
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

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f26764OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f26764OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f26757OooOo0 = new ArrayList();
        this.f26760OooOo0o = Period.FiveMin;
    }

    public final o7 OooOo() {
        return (o7) this.f26756OooOOoo.getValue();
    }

    public final void OooOoO0() {
        ArrayList arrayList = this.f26757OooOo0;
        oo0oO0 oo0oo0 = null;
        if (arrayList.size() >= 20) {
            oo0oO0 oo0oo1 = this.f26758OooOo00;
            if (oo0oo1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oo0oo0 = oo0oo1;
            }
            oo0oo0.OooOoO0(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(new RoomUserInfoModel());
        oo0oO0 oo0oo2 = this.f26758OooOo00;
        if (oo0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oo0oo0 = oo0oo2;
        }
        oo0oo0.OooOoO0(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Room.InitiateVoteRequest.DurationType durationType;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int i = 1;
        if (Intrinsics.areEqual(view, OooOo().f58527OooO0o)) {
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
            o0oo00o2.OooOoO(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_dialog_set_title));
            o0oo00o2.OooOoOO();
            o0oo00o2.OooO0o(false);
            final l8 l8VarInflate = l8.inflate(LayoutInflater.from(o0oo00o2.f10133OooO00o), o0oo00o2.f10135OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(l8VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            l8VarInflate.f58373OooO0O0.setText(OooOo().f58522OooO.getText());
            InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(60)};
            EditText editText = l8VarInflate.f58373OooO0O0;
            editText.setFilters(lengthFilterArr);
            p483o0o000oo.o0OO00O o0oo00o3 = p483o0o000oo.o0OO00O.f47708OooO0OO;
            if (o0oo00o3 == null) {
                o0oo00o3 = new p483o0o000oo.o0OO00O();
                p483o0o000oo.o0OO00O.f47708OooO0OO = o0oo00o3;
            }
            editText.setTransformationMethod(o0oo00o3);
            l8VarInflate.f58374OooO0OO.setText(editText.getText().toString().length() + "/60");
            editText.setSelection(OooOo().f58522OooO.getText().length());
            Intrinsics.checkNotNullExpressionValue(editText, "dialogBinding.etVoteSetTitle");
            editText.addTextChangedListener(new o0OO0o(l8VarInflate));
            editText.postDelayed(new Runnable() { // from class: com.yalla.yalla.ui.activity.room.o0oOo0O0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = VoteGameCreateActivity.f26755OooOo;
                    l8 dialogBinding = l8VarInflate;
                    Intrinsics.checkNotNullParameter(dialogBinding, "$dialogBinding");
                    EditText view2 = dialogBinding.f58373OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(view2, "dialogBinding.etVoteSetTitle");
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
                    view2.setFocusable(true);
                    view2.setFocusableInTouchMode(true);
                    view2.requestFocus();
                    inputMethodManagerOooO00o.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(view2.getContext().getApplicationContext(), new Handler()));
                }
            }, 200L);
            LinearLayoutCompat linearLayoutCompat = l8VarInflate.f58372OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "dialogBinding.root");
            o0oo00o2.OooOOo(linearLayoutCompat);
            o0oo00o2.f38242OooO0oO = false;
            o0oo00o2.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_save_title));
            o0oo00o2.OooOo0(new o0OOooO0(l8VarInflate, this, o0oo00o2));
            o0oo00o2.OooOO0(new o0OO0o00(l8VarInflate));
            o0oo00o2.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58526OooO0Oo)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            VoteGameGift voteGameGift = this.f26759OooOo0O;
            objectRef.element = voteGameGift != null ? voteGameGift.clone() : 0;
            p519o0o0O0oO.o00O00OO o00o00oo2 = new p519o0o0O0oO.o00O00OO(this, 0);
            int i2 = oO00OO0O.room_item_vote_game_gift;
            List<List<VoteGameGift>> value = t0.f45257OooO00o.getValue();
            Context context = o00o00oo2.f52532OooO0Oo;
            o0OO00o0 o0oo00o1 = new o0OO00o0(i2, context, value, objectRef);
            j8 j8VarInflate = j8.inflate(LayoutInflater.from(context), o00o00oo2.f52533OooO0o, false);
            new androidx.recyclerview.widget.o000OOo().attachToRecyclerView(j8VarInflate.f58184OooO0O0);
            FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context, 0);
            RecyclerView recyclerView = j8VarInflate.f58184OooO0O0;
            recyclerView.setLayoutManager(fixLinearLayoutManager);
            recyclerView.setAdapter(o0oo00o1);
            j8VarInflate.f58185OooO0OO.setOnClickListener(new o0OO0(o00o00oo2, this, objectRef));
            Intrinsics.checkNotNullExpressionValue(j8VarInflate, "inflate(LayoutInflater.f…     })\n                }");
            LinearLayoutCompat linearLayoutCompat2 = j8VarInflate.f58183OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "dialogBinding.root");
            o00o00oo2.OooO0oO(linearLayoutCompat2);
            LifeCycleDialog lifeCycleDialog = o00o00oo2.f52534OooO0o0;
            Window window = lifeCycleDialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = lifeCycleDialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
            }
            o00o00oo2.OooO();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58528OooO0o0)) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(oO00OOo0.room_vote_game_first_period), getString(oO00OOo0.room_vote_game_second_period), getString(oO00OOo0.room_vote_game_third_period), getString(oO00OOo0.room_vote_game_fourth_period), getString(oO00OOo0.room_vote_game_not_period)});
            int i3 = OooO00o.$EnumSwitchMapping$0[this.f26760OooOo0o.ordinal()];
            if (i3 == 1) {
                i = 0;
            } else if (i3 != 2) {
                if (i3 == 3) {
                    i = 2;
                } else if (i3 == 4) {
                    i = 3;
                } else {
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 4;
                }
            }
            p157o00OoOO0.o00O0O o00o0o2 = new p157o00OoOO0.o00O0O(this, null);
            o00o0o2.OooOOOO(listListOf);
            o00o0o2.f38235OooOO0O = Integer.valueOf(com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9));
            int i4 = o00o0o2.f38234OooOO0;
            o00o0o2.f38234OooOO0 = i;
            o00OoOO0.o00O0O.OooO0O0 oooO0O0 = o00o0o2.f38231OooO;
            oooO0O0.notifyItemChanged(i4);
            oooO0O0.notifyItemChanged(o00o0o2.f38234OooOO0);
            o00o0o2.OooOOOo(new o0OO0O0(this, listListOf));
            o00o0o2.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58524OooO0O0)) {
            ArrayList arrayList = this.f26757OooOo0;
            if (arrayList.size() < 2) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_less_select_two_user);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            String string = OooOo().f58522OooO.getText().toString();
            if (StringsKt.trim((CharSequence) string).toString().length() == 0) {
                String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_create_title_is_empty);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o2 = com.code.android.util.o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                    return;
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
            }
            VoteGameGift voteGameGift2 = this.f26759OooOo0O;
            Long lValueOf = voteGameGift2 != null ? Long.valueOf(voteGameGift2.getGiftId()) : null;
            Period period = this.f26760OooOo0o;
            period.getClass();
            int i5 = Period.OooO00o.$EnumSwitchMapping$0[period.ordinal()];
            if (i5 == 1) {
                durationType = Room.InitiateVoteRequest.DurationType.FiveMin;
            } else if (i5 == 2) {
                durationType = Room.InitiateVoteRequest.DurationType.TenMin;
            } else if (i5 == 3) {
                durationType = Room.InitiateVoteRequest.DurationType.ThirtyMin;
            } else if (i5 == 4) {
                durationType = Room.InitiateVoteRequest.DurationType.SixtyMin;
            } else {
                if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                durationType = Room.InitiateVoteRequest.DurationType.Infinite;
            }
            Room.InitiateVoteRequest.Builder builderNewBuilder = Room.InitiateVoteRequest.newBuilder();
            builderNewBuilder.addAllUserIds(arrayList2);
            builderNewBuilder.setTitle(string);
            Intrinsics.checkNotNull(lValueOf);
            builderNewBuilder.setGiftId(lValueOf.longValue());
            builderNewBuilder.setDurationType(durationType);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1100000, builderNewBuilder.build().toByteArray());
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58523OooO00o);
        OooOOoo(oO00OOo0.room_vote_game_page_title);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo(oOo00OO0.room_vote_game_page_menu, new o0OO000(this));
        }
        OooOo().f58527OooO0o.setOnClickListener(this);
        OooOo().f58530OooO0oo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_first_period));
        OooOo().f58528OooO0o0.setOnClickListener(this);
        OooOo().f58524OooO0O0.setOnClickListener(this);
        oo0oO0 oo0oo0 = new oo0oO0(this, oO00OO0O.room_item_vote_game);
        this.f26758OooOo00 = oo0oo0;
        oo0oo0.f10098OooO0o = new o0O0o0(this);
        OooOo().f58529OooO0oO.setLayoutManager(new FixGridLayoutManager(this, 5));
        RecyclerView recyclerView = OooOo().f58529OooO0oO;
        oo0oO0 oo0oo1 = this.f26758OooOo00;
        if (oo0oo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0oo1 = null;
        }
        recyclerView.setAdapter(oo0oo1);
        OooOoO0();
        t0.f45257OooO00o.observe(this, new OooO0O0(new o0O0oo00(this)));
        LiveEventBus.get("INITIATE_VOTE_REQUEST").observe(this, new o0O(this));
    }
}
