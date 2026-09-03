package com.yalla.yalla.ui.fragment;

import Oooo000.o000OO00;
import Oooo000.o00O00;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p261o00ooOoO.u;
import p649o0ooOOoo.ac;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J9\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR+\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010*\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MessageFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ac;", "", "updateNavigatorDot", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "isSelected", "showRedDot", "Lkotlin/Function0;", "onClick", "TabItem", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lo000oOoO/oOO00O;II)V", "Lcom/yalla/yalla/ui/fragment/MessageListFragment;", "messageListFragment", "Lcom/yalla/yalla/ui/fragment/MessageListFragment;", "Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "friendsListFragment", "Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "<set-?>", "showMessageRedDot$delegate", "Lo000oOoO/o0O00OO;", "getShowMessageRedDot", "()Z", "setShowMessageRedDot", "(Z)V", "showMessageRedDot", "", "currentSelectTab$delegate", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MessageFragment extends p503o0o00o00.OooO<ac> {
    public static final int $stable = 8;

    @Nullable
    private p462o0Ooo0o.o0000O00 fragmentPagerAdapter;

    @Nullable
    private FriendListFragment friendsListFragment;

    @Nullable
    private MessageListFragment messageListFragment;

    /* JADX INFO: renamed from: showMessageRedDot$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO showMessageRedDot = o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentSelectTab = o0OOO00.OooO0Oo(0);

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24025Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f24025Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24025Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f24026Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f24028Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24029Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f24030OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24031OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f24032OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f24028Oooo0oO = str;
            this.f24029Oooo0oo = z;
            this.f24026Oooo = z2;
            this.f24031OoooO00 = function0;
            this.f24030OoooO0 = i;
            this.f24032OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MessageFragment.this.TabItem(this.f24028Oooo0oO, this.f24029Oooo0oo, this.f24026Oooo, this.f24031OoooO00, ooo00o, this.f24030OoooO0 | 1, this.f24032OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooO0OO() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                MessageFragment messageFragment = MessageFragment.this;
                composer.OooO0o0(733328855);
                o0O0O00.o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = androidx.compose.ui.platform.o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = androidx.compose.ui.platform.o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = androidx.compose.ui.platform.o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r0 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r0);
                ?? r1 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r1);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r2);
                ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooO0Oo(oooO00o), 48, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 40, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
                o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
                Intrinsics.checkNotNullParameter(o00oooo0OooO, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false));
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooOOoo);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(p031OoooO.o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r0, composer, oooO2, r1, composer, layoutDirection2, r2, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
                messageFragment.TabItem(p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -678309503, R.string.nav_title_message, composer), messageFragment.getCurrentSelectTab() == 0, messageFragment.getShowMessageRedDot(), new OooOOO(messageFragment), composer, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
                messageFragment.TabItem(o00000.OooO0OO.OooO00o(R.string.relation_friends, composer), messageFragment.getCurrentSelectTab() == 1, false, new OooOOOO(messageFragment), composer, ShareRequest.THUMB_DATA_SIZE_LIMIT, 4);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                p263o00ooo.o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.icon_friends_addfriends, composer);
                long jOooOOoo = u.OooO0O0(composer).OooOOoo();
                o00OO0OO alignment2 = o00OO0O0.OooO00o.f4177OooO0oO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment2, false);
                Intrinsics.checkNotNullParameter(other, "other");
                p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o, null, PaddingKt.OooO0o0(p254o00ooO0O.o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(other, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 30), false, false, new OooOo00(messageFragment), new Oooo000(messageFragment), 189), 4), jOooOOoo, composer, 56, 0);
                o0O0OO0.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements ViewPager.OooOOO0 {
        public OooO0o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MessageFragment.this.setCurrentSelectTab(i);
            if (i == 0) {
                FragmentActivity activity = MessageFragment.this.getActivity();
                Intrinsics.checkNotNull(activity);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                View viewFindViewById = activity.findViewById(android.R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: TabItem$lambda-5$lambda-3, reason: not valid java name */
    private static final float m379TabItem$lambda5$lambda3(oO0Oo<Float> oo0oo) {
        return oo0oo.getValue().floatValue();
    }

    /* JADX INFO: renamed from: TabItem$lambda-5$lambda-4, reason: not valid java name */
    private static final long m380TabItem$lambda5$lambda4(oO0Oo<p145o00Oo0.o00000O0> oo0oo) {
        return oo0oo.getValue().f32070OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowMessageRedDot() {
        return ((Boolean) this.showMessageRedDot.getValue()).booleanValue();
    }

    private final void initView() {
        getBinding().f48935OooO0O0.setContent(o00O0000.OooO0O0(-1877434852, true, new OooO0OO()));
        ArrayList arrayList = new ArrayList();
        MessageListFragment messageListFragment = new MessageListFragment();
        this.messageListFragment = messageListFragment;
        Intrinsics.checkNotNull(messageListFragment);
        arrayList.add(messageListFragment);
        FriendListFragment friendListFragment = new FriendListFragment();
        this.friendsListFragment = friendListFragment;
        Intrinsics.checkNotNull(friendListFragment);
        arrayList.add(friendListFragment);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        this.fragmentPagerAdapter = new p462o0Ooo0o.o0000O00(childFragmentManager, arrayList);
        getBinding().f48936OooO0OO.setAdapter(this.fragmentPagerAdapter);
        getBinding().f48936OooO0OO.setOffscreenPageLimit(1);
        getBinding().f48936OooO0OO.OooO0O0(new OooO0o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m381onLazyInit$lambda0(MessageFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateNavigatorDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-1, reason: not valid java name */
    public static final void m382onLazyInit$lambda1(MessageFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateNavigatorDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    private final void setShowMessageRedDot(boolean z) {
        this.showMessageRedDot.setValue(Boolean.valueOf(z));
    }

    private final void updateNavigatorDot() {
        Integer value;
        Integer value2;
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        MediatorLiveData<Integer> unreadMessageCount = sharedMessageVM.getUnreadMessageCount();
        Integer num = 0;
        if (unreadMessageCount == null || (value = unreadMessageCount.getValue()) == null) {
            value = num;
        }
        int iIntValue = value.intValue();
        LiveData<Integer> unreadMomentsMessageCount = sharedMessageVM.getUnreadMomentsMessageCount();
        if (unreadMomentsMessageCount != null && (value2 = unreadMomentsMessageCount.getValue()) != null) {
            num = value2;
        }
        setShowMessageRedDot(iIntValue > 0 || num.intValue() > 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x0202  */
    /* JADX WARN: Code duplicated, block: B:83:0x0216  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull String title, boolean z, boolean z2, @NotNull Function0<Unit> onClick, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean zOooo0oo;
        Object objOooO0o;
        o0O0O00.o000000 o000000VarOooO00o;
        o0000O0O.OooO oooO;
        LayoutDirection layoutDirection;
        o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        float f;
        long j;
        oOO00O ooo00o2;
        boolean z7;
        boolean z8;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        oOO00O composer = ooo00o.OooOOo(729383266);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                z3 = z;
                i3 |= composer.OooO0OO(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z4 = z2;
                    if (composer.OooO0OO(z4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composer.Oooo0oo(onClick)) {
                        i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !composer.OooOo0()) {
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                    o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
                    o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(onClick);
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o = new OooO00o(onClick);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                    o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                    layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                    oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                    oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z5) {
                        f = 1.06f;
                    } else {
                        f = 1.0f;
                    }
                    oO0Oo oo0ooOooO0O0 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                    p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                    if (z5) {
                        j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                    } else {
                        j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                    }
                    oO0Oo oo0ooOooO00o = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                    long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(16);
                    o00000oO.o0000O00.OooO00o oooO00o2 = p053o00000oO.o0000O00.f27125Oooo0oO;
                    ooo00o2 = composer;
                    p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O0)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o), jOooO0OO, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
                    o0O0OO0.OooO00o(ooo00o2);
                    z7 = z5;
                    z8 = z6;
                } else {
                    composer.OooOoo0();
                    z7 = z3;
                    z8 = z4;
                    ooo00o2 = composer;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0O0(title, z7, z8, onClick, i, i2));
            }
            i3 |= 384;
            z4 = z2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composer.Oooo0oo(onClick)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
                o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(onClick);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o3, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo2, false, composer, -1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO2);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                oO0Oo oo0ooOooO0O1 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o2 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z5) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o2 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o4 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O1)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o2), jOooO0OO2, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
                o0O0OO0.OooO00o(ooo00o2);
                z7 = z5;
                z8 = z6;
            } else {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                o00OO0OO o00oo0oo3 = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0.OooO00o oooO00o5 = o00OOOO0.OooO00o.f4198Oooo0o;
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(onClick);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0oO3 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o5, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo3, false, composer, -1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO3);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                oO0Oo oo0ooOooO0O2 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o3 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z5) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o3 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                long jOooO0OO3 = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o6 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O2)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o3), jOooO0OO3, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
                o0O0OO0.OooO00o(ooo00o2);
                z7 = z5;
                z8 = z6;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(title, z7, z8, onClick, i, i2));
        }
        i3 |= 48;
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z4 = z2;
                if (composer.OooO0OO(z4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composer.Oooo0oo(onClick)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                o00OO0OO o00oo0oo4 = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0.OooO00o oooO00o7 = o00OOOO0.OooO00o.f4198Oooo0o;
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(onClick);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0oO4 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o7, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo4, false, composer, -1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO4);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                oO0Oo oo0ooOooO0O3 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o4 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z5) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o4 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                long jOooO0OO4 = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o8 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O3)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o4), jOooO0OO4, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
                o0O0OO0.OooO00o(ooo00o2);
                z7 = z5;
                z8 = z6;
            } else {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                o00OO0OO o00oo0oo5 = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0.OooO00o oooO00o9 = o00OOOO0.OooO00o.f4198Oooo0o;
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(onClick);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(onClick);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0oO5 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o9, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo5, false, composer, -1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO5);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                oO0Oo oo0ooOooO0O4 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
                p507o0o00oOO.o0000O0 o0000o5 = p507o0o00oOO.o0000O0.f41691OooO00o;
                if (z5) {
                    j = p507o0o00oOO.o0000O0.f41693OooO0OO;
                } else {
                    j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                }
                oO0Oo oo0ooOooO00o5 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
                long jOooO0OO5 = o0000O0O.o00Oo0.OooO0OO(16);
                o00000oO.o0000O00.OooO00o oooO00o10 = p053o00000oO.o0000O00.f27125Oooo0oO;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O4)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o5), jOooO0OO5, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
                o0O0OO0.OooO00o(ooo00o2);
                z7 = z5;
                z8 = z6;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(title, z7, z8, onClick, i, i2));
        }
        i3 |= 384;
        z4 = z2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composer.Oooo0oo(onClick)) {
                i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
            o00OO0OO o00oo0oo6 = o00OO0O0.OooO00o.f4175OooO0o;
            o00OOOO0.OooO00o oooO00o11 = o00OOOO0.OooO00o.f4198Oooo0o;
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(onClick);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0oO6 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o11, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo6, false, composer, -1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO6);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z5) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            oO0Oo oo0ooOooO0O5 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o6 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z5) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o6 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
            long jOooO0OO6 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o12 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O5)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o6), jOooO0OO6, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
            o0O0OO0.OooO00o(ooo00o2);
            z7 = z5;
            z8 = z6;
        } else {
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
            o00OO0OO o00oo0oo7 = o00OO0O0.OooO00o.f4175OooO0o;
            o00OOOO0.OooO00o oooO00o13 = o00OOOO0.OooO00o.f4198Oooo0o;
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(onClick);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(onClick);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0oO7 = PaddingKt.OooO0oO(SizeKt.OooO0Oo(p254o00ooO0O.o000O0o.OooO0O0(oooO00o13, false, false, null, (Function0) objOooO0o, 253)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo7, false, composer, -1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO7);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z5) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            oO0Oo oo0ooOooO0O6 = p023Oooo00O.o0OoOo0.OooO0O0(f, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48);
            p507o0o00oOO.o0000O0 o0000o7 = p507o0o00oOO.o0000O0.f41691OooO00o;
            if (z5) {
                j = p507o0o00oOO.o0000O0.f41693OooO0OO;
            } else {
                j = p507o0o00oOO.o0000O0.f41697OooO0oO;
            }
            oO0Oo oo0ooOooO00o7 = o000OO00.OooO00o(j, p023Oooo00O.o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip300, 0, null, 6), composer, 48, 4);
            long jOooO0OO7 = o0000O0O.o00Oo0.OooO0OO(16);
            o00000oO.o0000O00.OooO00o oooO00o14 = p053o00000oO.o0000O00.f27125Oooo0oO;
            ooo00o2 = composer;
            p031OoooO.o000O0O0.OooO0OO(title, o00O00.OooOOO0(p442o0OoOo0.o0OO00O.OooO00o(m379TabItem$lambda5$lambda3(oo0ooOooO0O6)), z6, 0L, (float) 3.5d, true, false, 6, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 818), m380TabItem$lambda5$lambda4(oo0ooOooO00o7), jOooO0OO7, null, p053o00000oO.o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i7 & 14) | 199680, 0, 65488);
            o0O0OO0.OooO00o(ooo00o2);
            z7 = z5;
            z8 = z6;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(title, z7, z8, onClick, i, i2));
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        MediatorLiveData<Integer> unreadMessageCount = sharedMessageVM.getUnreadMessageCount();
        Intrinsics.checkNotNull(unreadMessageCount);
        unreadMessageCount.observe(getViewLifecycleOwner(), new p044OooooOO.o00O000(this, 7));
        LiveData<Integer> unreadMomentsMessageCount = sharedMessageVM.getUnreadMomentsMessageCount();
        Intrinsics.checkNotNull(unreadMomentsMessageCount);
        unreadMomentsMessageCount.observe(getViewLifecycleOwner(), new p159o00OoOO.o00000O(this, 5));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LiveEventBus.get("Check_Connect").post(Boolean.TRUE);
        if (p137o00OO0oo.OooO.f31646OooO00o > 0) {
            p137o00OO0oo.OooO.f31646OooO00o = 0;
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ac getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ac acVarInflate = ac.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(acVarInflate, "inflate(inflater, container, false)");
        return acVarInflate;
    }
}
