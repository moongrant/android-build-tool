package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
import p407o0Oo0OOO.a0;
import p407o0Oo0OOO.c;
import p407o0Oo0OOO.y;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Period", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVoteGameCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n22#2,2:330\n75#3,13:332\n65#4,16:345\n93#4,3:361\n1#5:364\n*S KotlinDebug\n*F\n+ 1 VoteGameCreateActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteGameCreateActivity\n*L\n59#1:330,2\n60#1:332,13\n177#1:345,16\n177#1:361,3\n*E\n"})
public final class VoteGameCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26303OooOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26304OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(c.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26305OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public o0O0O0o0 f26306OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public VoteGameGift f26307OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public Period f26308OooOo0o;

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
        public final /* synthetic */ Function1 f26309OooO0Oo;

        public OooO0O0(o0O0oo0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26309OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26309OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26309OooO0Oo;
        }

        public final int hashCode() {
            return this.f26309OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26309OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$Period[], still in use, count: 1, list:
      (r10v2 com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$Period[]) from 0x0043: INVOKE (r10v2 com.yalla.yalla.ui.activity.room.VoteGameCreateActivity$Period[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:68)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteGameCreateActivity$Period;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "FiveMin", "TenMin", "ThirtyMin", "SixtyMin", "Infinite", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Period {
        FiveMin(1),
        TenMin(2),
        ThirtyMin(3),
        SixtyMin(4),
        Infinite(100);

        private static final /* synthetic */ EnumEntries $ENTRIES;
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

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(periodArr);
        }

        public Period(int i) {
            super(str, i);
            this.value = i;
        }

        public static Period valueOf(String str) {
            return (Period) Enum.valueOf(Period.class, str);
        }

        public static Period[] values() {
            return (Period[]) $VALUES.clone();
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
            public final /* synthetic */ Function0 f26312OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f26312OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f26305OooOo0 = new ArrayList();
        this.f26308OooOo0o = Period.FiveMin;
    }

    public final c OooOo() {
        return (c) this.f26304OooOOoo.getValue();
    }

    public final void OooOoO0() {
        ArrayList arrayList = this.f26305OooOo0;
        o0O0O0o0 o0o0o0o0 = null;
        if (arrayList.size() >= 20) {
            o0O0O0o0 o0o0o0o1 = this.f26306OooOo00;
            if (o0o0o0o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o0o0o0o0 = o0o0o0o1;
            }
            o0o0o0o0.OooOoO0(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(new RoomUserInfoModel());
        o0O0O0o0 o0o0o0o2 = this.f26306OooOo00;
        if (o0o0o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0o0o0o0 = o0o0o0o2;
        }
        o0o0o0o0.OooOoO0(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Room.InitiateVoteRequest.DurationType durationType;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int i = 1;
        if (Intrinsics.areEqual(view, OooOo().f43748OooO0o)) {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this);
            o000o.OooOoO(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_vote_game_dialog_set_title));
            o000o.OooOoOO();
            o000o.OooO0o(false);
            a0 a0VarInflate = a0.inflate(LayoutInflater.from(o000o.f38482OooO00o), o000o.f38484OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(a0VarInflate, "inflate(...)");
            a0VarInflate.f43707OooO0O0.setText(OooOo().f43743OooO.getText());
            InputFilter.LengthFilter[] lengthFilterArr = {new InputFilter.LengthFilter(60)};
            EditText etVoteSetTitle = a0VarInflate.f43707OooO0O0;
            etVoteSetTitle.setFilters(lengthFilterArr);
            p491o0o00O00.OooO0OO oooO0OO = p491o0o00O00.OooO0OO.f48883OooO0OO;
            if (oooO0OO == null) {
                oooO0OO = new p491o0o00O00.OooO0OO();
                p491o0o00O00.OooO0OO.f48883OooO0OO = oooO0OO;
            }
            etVoteSetTitle.setTransformationMethod(oooO0OO);
            a0VarInflate.f43708OooO0OO.setText(etVoteSetTitle.getText().toString().length() + "/60");
            etVoteSetTitle.setSelection(OooOo().f43743OooO.getText().length());
            Intrinsics.checkNotNullExpressionValue(etVoteSetTitle, "etVoteSetTitle");
            etVoteSetTitle.addTextChangedListener(new o0oOo0O0(a0VarInflate));
            etVoteSetTitle.postDelayed(new p110o000ooo0.o00000O0(a0VarInflate, 1), 200L);
            LinearLayoutCompat linearLayoutCompat = a0VarInflate.f43706OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "getRoot(...)");
            o000o.OooOOo(linearLayoutCompat);
            o000o.f39358OooO0oO = false;
            o000o.OooOOOo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_vote_game_save_title));
            o000o.OooOo0(new o0O0o00O(a0VarInflate, this, o000o));
            o000o.OooOO0(new o0O0o0(a0VarInflate));
            o000o.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f43747OooO0Oo)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            VoteGameGift voteGameGift = this.f26307OooOo0O;
            objectRef.element = voteGameGift != null ? voteGameGift.clone() : 0;
            p675oO0Oo.o0oO0Ooo o0oo0ooo2 = new p675oO0Oo.o0oO0Ooo(this, 0);
            int i2 = p565o0oOo000.o0OO00O.room_item_vote_game_gift;
            List<List<VoteGameGift>> value = p413o0Oo0o00.OooOOO0.f45930OooO00o.getValue();
            Context context = o0oo0ooo2.f59572OooO0Oo;
            o0O0OOOo o0o0oooo = new o0O0OOOo(i2, context, value, objectRef);
            y yVarInflate = y.inflate(LayoutInflater.from(context), o0oo0ooo2.f59573OooO0o, false);
            new androidx.recyclerview.widget.o000000().attachToRecyclerView(yVarInflate.f45691OooO0O0);
            FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context, 0);
            RecyclerView recyclerView = yVarInflate.f45691OooO0O0;
            recyclerView.setLayoutManager(fixLinearLayoutManager);
            recyclerView.setAdapter(o0o0oooo);
            yVarInflate.f45692OooO0OO.setOnClickListener(new oo0OOoo(o0oo0ooo2, this, objectRef));
            Intrinsics.checkNotNullExpressionValue(yVarInflate, "apply(...)");
            LinearLayoutCompat linearLayoutCompat2 = yVarInflate.f45690OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "getRoot(...)");
            o0oo0ooo2.OooO0oO(linearLayoutCompat2);
            LifeCycleDialog lifeCycleDialog = o0oo0ooo2.f59574OooO0o0;
            Window window = lifeCycleDialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = lifeCycleDialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(p565o0oOo000.o000000.anim_bottom_top_bottom);
            }
            o0oo0ooo2.OooO();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f43749OooO0o0)) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(p565o0oOo000.o000OOo.room_vote_game_first_period), getString(p565o0oOo000.o000OOo.room_vote_game_second_period), getString(p565o0oOo000.o000OOo.room_vote_game_third_period), getString(p565o0oOo000.o000OOo.room_vote_game_fourth_period), getString(p565o0oOo000.o000OOo.room_vote_game_not_period)});
            int i3 = OooO00o.$EnumSwitchMapping$0[this.f26308OooOo0o.ordinal()];
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
            p205o00o0o0o.o000O0o o000o0o2 = new p205o00o0o0o.o000O0o(this, null);
            o000o0o2.OooOOOO(listListOf);
            o000o0o2.f39373OooOO0O = Integer.valueOf(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
            int i4 = o000o0o2.f39372OooOO0;
            o000o0o2.f39372OooOO0 = i;
            o00o0o0o.o000O0o.OooO0O0 oooO0O0 = o000o0o2.f39369OooO;
            oooO0O0.notifyItemChanged(i4);
            oooO0O0.notifyItemChanged(o000o0o2.f39372OooOO0);
            o000o0o2.OooOOOo(new o0O0o000(this, listListOf));
            o000o0o2.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f43745OooO0O0)) {
            ArrayList arrayList = this.f26305OooOo0;
            if (arrayList.size() < 2) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_vote_game_less_select_two_user);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            String string = OooOo().f43743OooO.getText().toString();
            if (StringsKt.trim((CharSequence) string).toString().length() == 0) {
                String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_vote_game_create_title_is_empty);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                    return;
                } else {
                    com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
            }
            VoteGameGift voteGameGift2 = this.f26307OooOo0O;
            Long lValueOf = voteGameGift2 != null ? Long.valueOf(voteGameGift2.getGiftId()) : null;
            Period period = this.f26308OooOo0o;
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
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1100000, builderNewBuilder.build().toByteArray());
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43744OooO00o);
        OooOOoo(p565o0oOo000.o000OOo.room_vote_game_page_title);
        HeaderLayout headerLayout = this.f22289OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo(p565o0oOo000.o0OOO0o.room_vote_game_page_menu, new o0O0O0Oo(this));
        }
        OooOo().f43748OooO0o.setOnClickListener(this);
        OooOo().f43751OooO0oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_vote_game_first_period));
        OooOo().f43749OooO0o0.setOnClickListener(this);
        OooOo().f43745OooO0O0.setOnClickListener(this);
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0(this, p565o0oOo000.o0OO00O.room_item_vote_game);
        this.f26306OooOo00 = o0o0o0o0;
        o0o0o0o0.f13187OooO0o = new p022Oooo00O.oo0O(this);
        OooOo().f43750OooO0oO.setLayoutManager(new FixGridLayoutManager(this, 5));
        RecyclerView recyclerView = OooOo().f43750OooO0oO;
        o0O0O0o0 o0o0o0o1 = this.f26306OooOo00;
        if (o0o0o0o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0o0o0o1 = null;
        }
        recyclerView.setAdapter(o0o0o0o1);
        OooOoO0();
        p413o0Oo0o00.OooOOO0.f45930OooO00o.observe(this, new OooO0O0(new o0O0oo0o(this)));
        LiveEventBus.get("INITIATE_VOTE_REQUEST").observe(this, new Observer() { // from class: com.yalla.yalla.ui.activity.room.o0oO0O0o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = VoteGameCreateActivity.f26303OooOo;
                VoteGameCreateActivity this$0 = this.f26484OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.InitiateVoteReply");
                long createUserId = ((Room.InitiateVoteReply) obj).getCreateUserId();
                p474o0OoooOO.oo0oO0 oo0oo0 = p474o0OoooOO.oo0oO0.f47967OooO00o;
                Long l = (Long) p474o0OoooOO.oo0oO0.OooOOo0().getValue();
                if (l != null && createUserId == l.longValue()) {
                    h0.OooO0O0("102106");
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Success);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    this$0.finish();
                }
            }
        });
    }
}
