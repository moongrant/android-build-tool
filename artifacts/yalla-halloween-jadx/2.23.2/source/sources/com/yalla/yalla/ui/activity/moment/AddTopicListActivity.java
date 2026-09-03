package com.yalla.yalla.ui.activity.moment;

import android.R;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.o00oOoo;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.ooo0o;
import p423o0OoO0OO.o00O0O0O;
import p571o0oOoO0.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/AddTopicListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "recentlyListMax3", "recentlyListAll", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAddTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,556:1\n22#2,2:557\n75#3,13:559\n81#4:572\n107#4,2:573\n*S KotlinDebug\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity\n*L\n72#1:557,2\n73#1:559,13\n153#1:572\n153#1:573,2\n*E\n"})
public final class AddTopicListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f25562OooOoOO = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f25569OooOoO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25563OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(ooo0o.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25566OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25592OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25592OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25565OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25567OooOo0O = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25568OooOo0o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25564OooOo = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableState f25570OooOoO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public static final class OooO extends Lambda implements Function0<ConcatAdapter> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConcatAdapter invoke() {
            ConcatAdapter concatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            concatAdapter.OooO0O0((OooO00o) addTopicListActivity.f25565OooOo0.getValue());
            concatAdapter.OooO0O0((OooO00o) addTopicListActivity.f25567OooOo0O.getValue());
            return concatAdapter;
        }
    }

    @SourceDebugExtension({"SMAP\nAddTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$TopicAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1855#2,2:557\n1855#2,2:559\n*S KotlinDebug\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$TopicAdapter\n*L\n426#1:557,2\n429#1:559,2\n*E\n"})
    public static final class OooO00o extends o0000oo<TopicInfoModel> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public Function1<? super Boolean, Unit> f25572OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @NotNull
        public final AddTopicListActivity f25573OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @Nullable
        public Function1<? super Integer, Unit> f25574OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @NotNull
        public final Lazy f25575OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        @NotNull
        public final Lazy f25576Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        @NotNull
        public final Lazy f25577Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        @NotNull
        public String f25578Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public boolean f25579Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        @NotNull
        public final Lazy f25580Oooo0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0324OooO00o extends Lambda implements Function0<Drawable> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0324OooO00o f25581OooO0Oo = new C0324OooO00o();

            public C0324OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Drawable invoke() {
                return o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_topic_recently_down);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<List<TopicInfoModel>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0O0 f25582OooO0Oo = new OooO0O0();

            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<TopicInfoModel> invoke() {
                return new ArrayList();
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<List<TopicInfoModel>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0OO f25583OooO0Oo = new OooO0OO();

            public OooO0OO() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<TopicInfoModel> invoke() {
                return new ArrayList();
            }
        }

        public static final class OooO0o extends Lambda implements Function0<Drawable> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0o f25584OooO0Oo = new OooO0o();

            public OooO0o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Drawable invoke() {
                return o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_topic_recently_up);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull AddTopicListActivity activity) {
            super(activity, p562o0oOo000.oo0o0Oo.item_add_topic_list);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f25573OooOoo0 = activity;
            this.f25575OooOooo = LazyKt.lazy(OooO0o.f25584OooO0Oo);
            this.f25577Oooo000 = LazyKt.lazy(C0324OooO00o.f25581OooO0Oo);
            this.f25578Oooo00O = "";
            this.f25576Oooo0 = LazyKt.lazy(OooO0O0.f25582OooO0Oo);
            this.f25580Oooo0O0 = LazyKt.lazy(OooO0OO.f25583OooO0Oo);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            NetImageView netImageView;
            NetImageView netImageView2;
            TextView textView;
            TopicFollowPostNumberView topicFollowPostNumberView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            final ViewHolder helper = (ViewHolder) baseViewHolder;
            final TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (topicInfoModel == null || TextUtils.isEmpty(topicInfoModel.getName())) {
                return;
            }
            View view = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_local_list_tv_title);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            TextView textView5 = (TextView) view;
            Intrinsics.checkNotNullParameter(textView5, "<set-?>");
            View view2 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_local_list_tv_content);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            TextView textView6 = (TextView) view2;
            Intrinsics.checkNotNullParameter(textView6, "<set-?>");
            View view3 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_local_list_iv_upDown);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            ImageView imageView = (ImageView) view3;
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            View view4 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_local_list_view_line);
            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
            Intrinsics.checkNotNullParameter(view4, "<set-?>");
            View view5 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_layout_content);
            Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
            ConstraintLayout constraintLayout = (ConstraintLayout) view5;
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            View view6 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_layout);
            Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
            RelativeLayout relativeLayout = (RelativeLayout) view6;
            Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
            int i = p562o0oOo000.o0OO00O.item_add_topic_list_iv_head;
            View view7 = helper.getView(i);
            Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
            NetImageView netImageView3 = (NetImageView) view7;
            Intrinsics.checkNotNullParameter(netImageView3, "<set-?>");
            View view8 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_name_tv);
            Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
            TextView textView7 = (TextView) view8;
            Intrinsics.checkNotNullParameter(textView7, "<set-?>");
            View view9 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_join_tv);
            Intrinsics.checkNotNullExpressionValue(view9, "getView(...)");
            TextView textView8 = (TextView) view9;
            Intrinsics.checkNotNullParameter(textView8, "<set-?>");
            View view10 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_count_tv);
            Intrinsics.checkNotNullExpressionValue(view10, "getView(...)");
            TopicFollowPostNumberView topicFollowPostNumberView2 = (TopicFollowPostNumberView) view10;
            Intrinsics.checkNotNullParameter(topicFollowPostNumberView2, "<set-?>");
            View view11 = helper.getView(p562o0oOo000.o0OO00O.item_add_topic_list_info_tv);
            Intrinsics.checkNotNullExpressionValue(view11, "getView(...)");
            TextView textView9 = (TextView) view11;
            Intrinsics.checkNotNullParameter(textView9, "<set-?>");
            int i2 = 0;
            if (topicInfoModel.getIsRecentlyLocal()) {
                if (textView6 != null) {
                    textView3 = textView6;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView3 = null;
                }
                textView3.setOnClickListener(new p492o0o00OO0.OooO(i2, this, helper));
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                    textView5 = null;
                }
                textView5.setClickable(false);
                o000O.OooO0O0(textView5);
                if (topicInfoModel.getIsTitleLocal()) {
                    o000O.OooOOOO(textView5);
                    textView5.setText(o0000.OooO0OO(p562o0oOo000.o000000.Recently_Used));
                }
                if (textView6 != null) {
                    textView4 = textView6;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView4 = null;
                }
                o000O.OooOOOO(textView4);
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView6 = null;
                }
                textView6.setText(topicInfoModel.getName());
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("line");
                    view4 = null;
                }
                o000O.OooOOOO(view4);
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivUpDown");
                    imageView = null;
                }
                if (topicInfoModel.getIsUpLocal()) {
                    imageView.setImageDrawable((Drawable) this.f25575OooOooo.getValue());
                } else {
                    imageView.setImageDrawable((Drawable) this.f25577Oooo000.getValue());
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o0o00OO0.OooOO0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view12) {
                        AddTopicListActivity.OooO00o this$0 = this.f49091OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TopicInfoModel item = topicInfoModel;
                        Intrinsics.checkNotNullParameter(item, "$item");
                        Function1<? super Boolean, Unit> function1 = this$0.f25572OooOoo;
                        if (function1 != null) {
                            function1.invoke(Boolean.valueOf(!item.getIsUpLocal()));
                        }
                    }
                });
                o000O.OooO0O0(imageView);
                if (!this.f25579Oooo00o && helper.getLayoutPosition() >= 2 && this.f13189OooOOoo.size() == helper.getLayoutPosition() + 1 && ((List) this.f25576Oooo0.getValue()).size() > 3) {
                    o000O.OooOOOO(imageView);
                }
                if (relativeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listLayout");
                    relativeLayout = null;
                }
                o000O.OooO0O0(relativeLayout);
                return;
            }
            if (netImageView3 != null) {
                netImageView = netImageView3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView = null;
            }
            netImageView.setOnClickListener(new p492o0o00OO0.OooO0OO(i2, this, helper));
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutContent");
                constraintLayout = null;
            }
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o0o00OO0.OooO0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view12) {
                    AddTopicListActivity.OooO00o this$0 = this.f49089OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ViewHolder helper2 = helper;
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    Function1<? super Integer, Unit> function1 = this$0.f25574OooOooO;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(helper2.getLayoutPosition()));
                    }
                }
            });
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listLayout");
                relativeLayout = null;
            }
            o000O.OooOOOO(relativeLayout);
            if (netImageView3 != null) {
                netImageView2 = netImageView3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView2 = null;
            }
            int i3 = p562o0oOo000.o0Oo0oo.icon_head_default_circular;
            netImageView2.setImageResource(i3);
            helper.setImageResource(i, i3);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f25573OooOoo0);
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(60, 60, topicInfoModel.getImage());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0oO());
            if (netImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView3 = null;
            }
            oooO00o.OooO0Oo(netImageView3);
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("content");
                textView6 = null;
            }
            o000O.OooO0O0(textView6);
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("line");
                view4 = null;
            }
            o000O.OooO0O0(view4);
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                textView5 = null;
            }
            textView5.setClickable(false);
            o000O.OooO0O0(textView5);
            if (topicInfoModel.getIsTitleLocal()) {
                o000O.OooOOOO(textView5);
                textView5.setText(o0000.OooO0OO(p562o0oOo000.o000000.moment_add_topic_Recommended_for_You));
            }
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("name");
                textView7 = null;
            }
            Intrinsics.checkNotNullParameter(textView7, "<this>");
            textView7.setCompoundDrawables(null, null, null, null);
            textView7.setText("");
            if (!TextUtils.isEmpty(topicInfoModel.getName())) {
                Drawable drawableOooO0O0 = topicInfoModel.isOwner() ? o0000.OooO0O0(p562o0oOo000.o0Oo0oo.ic_topic_owner) : null;
                if (topicInfoModel.isManager()) {
                    drawableOooO0O0 = o0000.OooO0O0(p562o0oOo000.o0Oo0oo.ic_topic_manager);
                }
                o00O0O0O.OooO0o(textView7, drawableOooO0O0);
                textView7.setText(o0O0O0Oo.OooO00o(-16721719, topicInfoModel.getName(), this.f25578Oooo00O));
            }
            if (textView9 != null) {
                textView = textView9;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("info");
                textView = null;
            }
            textView.setText(o0000.OooO0OO(p562o0oOo000.o000000.topic_description_hint));
            if (!TextUtils.isEmpty(topicInfoModel.getDescribe())) {
                textView.setText(topicInfoModel.getDescribe());
            }
            if (topicFollowPostNumberView2 != null) {
                topicFollowPostNumberView = topicFollowPostNumberView2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("count");
                topicFollowPostNumberView = null;
            }
            topicFollowPostNumberView.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
            if (textView8 != null) {
                textView2 = textView8;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("join");
                textView2 = null;
            }
            o000O.OooO0O0(textView2);
            if (topicInfoModel.getIsJoin() == 1) {
                o000O.OooOOOO(textView2);
            }
        }

        public final void Oooo0o0(boolean z) {
            Lazy lazy = this.f25580Oooo0O0;
            Iterator it = ((List) lazy.getValue()).iterator();
            while (it.hasNext()) {
                ((TopicInfoModel) it.next()).setUpLocal(z);
            }
            Lazy lazy2 = this.f25576Oooo0;
            Iterator it2 = ((List) lazy2.getValue()).iterator();
            while (it2.hasNext()) {
                ((TopicInfoModel) it2.next()).setUpLocal(z);
            }
            if (z) {
                OooOoO0((List) lazy2.getValue());
            } else {
                OooOoO0((List) lazy.getValue());
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            OooO00o oooO00o = new OooO00o(addTopicListActivity);
            oooO00o.f13184OooOOO0 = false;
            oooO00o.f25574OooOooO = new com.yalla.yalla.ui.activity.moment.OooO00o(addTopicListActivity, oooO00o);
            oooO00o.f25572OooOoo = new com.yalla.yalla.ui.activity.moment.OooO0O0(oooO00o);
            return oooO00o;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            OooO00o oooO00o = new OooO00o(addTopicListActivity);
            oooO00o.f13184OooOOO0 = false;
            oooO00o.f25574OooOooO = new com.yalla.yalla.ui.activity.moment.OooO0OO(addTopicListActivity, oooO00o);
            return oooO00o;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            OooO00o oooO00o = new OooO00o(addTopicListActivity);
            oooO00o.f13184OooOOO0 = false;
            oooO00o.f25574OooOooO = new com.yalla.yalla.ui.activity.moment.OooO0o(addTopicListActivity, oooO00o);
            return oooO00o;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<List<TopicInfoModel>, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            int i = AddTopicListActivity.f25562OooOoOO;
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            ((OooO00o) addTopicListActivity.f25568OooOo0o.getValue()).OooOoO0(list2);
            addTopicListActivity.OooOoO0().f45345OooO0Oo.OooO0Oo();
            if (list2 == null || list2.isEmpty()) {
                addTopicListActivity.OooOoO0().f45345OooO0Oo.OooO0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            addTopicListActivity.f25569OooOoO = true;
            addTopicListActivity.OooOoO0().f45345OooO0Oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOo(AddTopicListActivity activity, TopicInfoModel topicInfoModel) {
        activity.getClass();
        if (topicInfoModel == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        BaseActivityK.OooOo0o(activity, null, 0L, 3);
        ((MomentTopicVM) activity.f25566OooOo00.getValue()).circleUserVerify(topicInfoModel.getId()).observe(activity, new p384o0OOoo0O.o000oOoO(new p492o0o00OO0.Oooo0(activity, topicInfoModel), p492o0o00OO0.o000oOoO.f49150OooO0Oo, new p492o0o00OO0.o0OoOo0(activity), false, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(String maskKey) throws IllegalAccessException, InvocationTargetException {
        Lazy lazy = this.f25568OooOo0o;
        OooO00o oooO00o = (OooO00o) lazy.getValue();
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(maskKey, "maskKey");
        oooO00o.f25578Oooo00O = maskKey;
        if (!StringsKt.isBlank(maskKey)) {
            OooOoO0().f45344OooO0OO.setAdapter((OooO00o) lazy.getValue());
            if (StringsKt.isBlank(maskKey)) {
                OooOoO0().f45345OooO0Oo.OooO0oo();
            }
            ((MomentTopicVM) this.f25566OooOo00.getValue()).circleSearch(maskKey).observe(this, new p384o0OOoo0O.o000oOoO(new OooOO0(), new OooOO0O(), null, false, 12));
            return;
        }
        RecyclerView recyclerView = OooOoO0().f45344OooO0OO;
        Lazy lazy2 = this.f25564OooOo;
        recyclerView.setAdapter((ConcatAdapter) lazy2.getValue());
        OooOoO0().f45345OooO0Oo.OooO0Oo();
        if (!this.f25569OooOoO || ((ConcatAdapter) lazy2.getValue()).getItemCount() >= 1) {
            return;
        }
        OooOoO0().f45345OooO0Oo.OooO0o0();
    }

    public final ooo0o OooOoO0() throws IllegalAccessException, InvocationTargetException {
        return (ooo0o) this.f25563OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        o0oo0000.OooO00o.OooO0O0("103018");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f45342OooO00o);
        o00oOoo.OooO00o(getWindow(), false);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        }
        ComposeView composeView = OooOoO0().f45343OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(548062655, true, new p492o0o00OO0.OooOo00(this)));
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(p562o0oOo000.o000000.Add_a_topic));
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo00(new p492o0o00OO0.OooOo(this));
        }
        OooOoO0().f45344OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO0().f45345OooO0Oo.setEmptyImage(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        OooOoO0().f45345OooO0Oo.setEmptyText(o0000.OooO0OO(p562o0oOo000.o000000.No_search_results));
        StateLayout stateLayout = OooOoO0().f45345OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new p492o0o00OO0.Oooo000(this), 3);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new com.yalla.yalla.ui.activity.moment.OooO(this, null), 2, null);
        OooOoO0().f45345OooO0Oo.OooO0oo();
        ViewModelLazy viewModelLazy = this.f25566OooOo00;
        ((MomentTopicVM) viewModelLazy.getValue()).circlePersonRecommendList().observe(this, new p384o0OOoo0O.o000oOoO(new com.yalla.yalla.ui.activity.moment.OooOO0(this), null, new com.yalla.yalla.ui.activity.moment.OooOO0O(this), false, 10));
        OooOoO0().f45344OooO0OO.setAdapter((ConcatAdapter) this.f25564OooOo.getValue());
        ((MomentTopicVM) viewModelLazy.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((MomentTopicVM) this.f25566OooOo00.getValue()).statisticalTime();
    }
}
