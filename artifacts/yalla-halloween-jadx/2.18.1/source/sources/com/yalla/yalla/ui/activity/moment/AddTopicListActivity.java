package com.yalla.yalla.ui.activity.moment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.facebook.share.internal.ShareConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0O0O00;
import p172o00OooO.o00O0O0;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p522o0o0O0o.oo0o0O0;
import p538o0o0Oo0.o000OOo;
import p538o0o0Oo0.o00Oo0;
import p538o0o0Oo0.o00oO0o;
import p538o0o0Oo0.o0OO00O;
import p538o0o0Oo0.o0OOO0o;
import p538o0o0Oo0.o0Oo0oo;
import p538o0o0Oo0.o0ooOOo;
import p538o0o0Oo0.oo0o0Oo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.mc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/AddTopicListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AddTopicListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22264o0OoOo0 = 0;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f22274Ooooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22265OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(mc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22266Ooooo00 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22267Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22297Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22297Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22268OooooO0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22269OooooOO = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22270OooooOo = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22272Oooooo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public String f22271Oooooo = "";

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final int f22273OoooooO = 50;

    public static final class OooO extends Lambda implements Function0<ConcatAdapter> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConcatAdapter invoke() {
            ConcatAdapter concatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            concatAdapter.OooO0O0(AddTopicListActivity.OooOoo(addTopicListActivity));
            concatAdapter.OooO0O0((OooO00o) addTopicListActivity.f22269OooooOO.getValue());
            return concatAdapter;
        }
    }

    public static final class OooO00o extends p188o00o00o0.OooO0OO<TopicInfoModel> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final Lazy f22276OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final AddTopicListActivity f22277OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Function1<? super Boolean, Unit> f22278OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Function1<? super Integer, Unit> f22279OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Lazy f22280OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public String f22281OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Lazy f22282OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f22283OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final Lazy f22284OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.moment.AddTopicListActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0254OooO00o extends Lambda implements Function0<Drawable> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final C0254OooO00o f22285Oooo0o = new C0254OooO00o();

            public C0254OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Drawable invoke() {
                return o000O0O0.OooO0O0(R.drawable.icon_topic_recently_down);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<List<TopicInfoModel>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO0O0 f22286Oooo0o = new OooO0O0();

            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<TopicInfoModel> invoke() {
                return new ArrayList();
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<List<TopicInfoModel>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO0OO f22287Oooo0o = new OooO0OO();

            public OooO0OO() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<TopicInfoModel> invoke() {
                return new ArrayList();
            }
        }

        public static final class OooO0o extends Lambda implements Function0<Drawable> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO0o f22288Oooo0o = new OooO0o();

            public OooO0o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Drawable invoke() {
                return o000O0O0.OooO0O0(R.drawable.icon_topic_recently_up);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull AddTopicListActivity activity) {
            super(activity, R.layout.item_add_topic_list);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f22277OooO00o = activity;
            this.f22280OooO0Oo = LazyKt.lazy(OooO0o.f22288Oooo0o);
            this.f22282OooO0o0 = LazyKt.lazy(C0254OooO00o.f22285Oooo0o);
            this.f22281OooO0o = "";
            this.f22284OooO0oo = LazyKt.lazy(OooO0O0.f22286Oooo0o);
            this.f22276OooO = LazyKt.lazy(OooO0OO.f22287Oooo0o);
        }

        public final List<TopicInfoModel> OooO00o() {
            return (List) this.f22284OooO0oo.getValue();
        }

        public final List<TopicInfoModel> OooO0O0() {
            return (List) this.f22276OooO.getValue();
        }

        public final void OooO0OO(boolean z) {
            Iterator<T> it = OooO0O0().iterator();
            while (it.hasNext()) {
                ((TopicInfoModel) it.next()).setUpLocal(z);
            }
            Iterator<T> it2 = OooO00o().iterator();
            while (it2.hasNext()) {
                ((TopicInfoModel) it2.next()).setUpLocal(z);
            }
            if (z) {
                setNewData(OooO00o());
            } else {
                setNewData(OooO0O0());
            }
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            NetImageView netImageView;
            NetImageView netImageView2;
            TextView textView;
            TextView textView2;
            TextView textView3;
            final p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (topicInfoModel == null || TextUtils.isEmpty(topicInfoModel.getName())) {
                return;
            }
            View viewOooO0Oo = helper.OooO0Oo(R.id.item_add_topic_local_list_tv_title);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.item…opic_local_list_tv_title)");
            TextView textView4 = (TextView) viewOooO0Oo;
            Intrinsics.checkNotNullParameter(textView4, "<set-?>");
            View viewOooO0Oo2 = helper.OooO0Oo(R.id.item_add_topic_local_list_tv_content);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView(R.id.item…ic_local_list_tv_content)");
            TextView textView5 = (TextView) viewOooO0Oo2;
            Intrinsics.checkNotNullParameter(textView5, "<set-?>");
            View viewOooO0Oo3 = helper.OooO0Oo(R.id.item_add_topic_local_list_iv_upDown);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo3, "helper.getView(R.id.item…pic_local_list_iv_upDown)");
            ImageView imageView = (ImageView) viewOooO0Oo3;
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            View viewOooO0Oo4 = helper.OooO0Oo(R.id.item_add_topic_local_list_view_line);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView(R.id.item…pic_local_list_view_line)");
            Intrinsics.checkNotNullParameter(viewOooO0Oo4, "<set-?>");
            View viewOooO0Oo5 = helper.OooO0Oo(R.id.item_add_topic_list_layout_content);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo5, "helper.getView(R.id.item…opic_list_layout_content)");
            ConstraintLayout constraintLayout = (ConstraintLayout) viewOooO0Oo5;
            Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
            View viewOooO0Oo6 = helper.OooO0Oo(R.id.item_add_topic_list_layout);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo6, "helper.getView(R.id.item_add_topic_list_layout)");
            RelativeLayout relativeLayout = (RelativeLayout) viewOooO0Oo6;
            Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
            View viewOooO0Oo7 = helper.OooO0Oo(R.id.item_add_topic_list_iv_head);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo7, "helper.getView(R.id.item_add_topic_list_iv_head)");
            NetImageView netImageView3 = (NetImageView) viewOooO0Oo7;
            Intrinsics.checkNotNullParameter(netImageView3, "<set-?>");
            View viewOooO0Oo8 = helper.OooO0Oo(R.id.item_add_topic_list_name_tv);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo8, "helper.getView(R.id.item_add_topic_list_name_tv)");
            TextView textView6 = (TextView) viewOooO0Oo8;
            Intrinsics.checkNotNullParameter(textView6, "<set-?>");
            View viewOooO0Oo9 = helper.OooO0Oo(R.id.item_add_topic_list_join_tv);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo9, "helper.getView(R.id.item_add_topic_list_join_tv)");
            TextView textView7 = (TextView) viewOooO0Oo9;
            Intrinsics.checkNotNullParameter(textView7, "<set-?>");
            View viewOooO0Oo10 = helper.OooO0Oo(R.id.item_add_topic_list_count_tv);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo10, "helper.getView(R.id.item_add_topic_list_count_tv)");
            TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) viewOooO0Oo10;
            Intrinsics.checkNotNullParameter(topicFollowPostNumberView, "<set-?>");
            View viewOooO0Oo11 = helper.OooO0Oo(R.id.item_add_topic_list_info_tv);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo11, "helper.getView(R.id.item_add_topic_list_info_tv)");
            TextView textView8 = (TextView) viewOooO0Oo11;
            Intrinsics.checkNotNullParameter(textView8, "<set-?>");
            if (topicInfoModel.getIsRecentlyLocal()) {
                if (textView5 != null) {
                    textView2 = textView5;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView2 = null;
                }
                textView2.setOnClickListener(new p538o0o0Oo0.o00O0O(this, helper, 0));
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                    textView4 = null;
                }
                textView4.setClickable(false);
                oOO00O.OooO00o(textView4);
                if (topicInfoModel.getIsTitleLocal()) {
                    oOO00O.OooO(textView4);
                    textView4.setText(o000O0O0.OooO0OO(R.string.Recently_Used));
                }
                if (textView5 != null) {
                    textView3 = textView5;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView3 = null;
                }
                oOO00O.OooO(textView3);
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("content");
                    textView5 = null;
                }
                textView5.setText(topicInfoModel.getName());
                if (viewOooO0Oo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("line");
                    viewOooO0Oo4 = null;
                }
                oOO00O.OooO(viewOooO0Oo4);
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivUpDown");
                    imageView = null;
                }
                if (topicInfoModel.getIsUpLocal()) {
                    imageView.setImageDrawable((Drawable) this.f22280OooO0Oo.getValue());
                } else {
                    imageView.setImageDrawable((Drawable) this.f22282OooO0o0.getValue());
                }
                imageView.setOnClickListener(new o00Oo0(this, topicInfoModel, 0));
                oOO00O.OooO00o(imageView);
                if (!this.f22283OooO0oO && helper.getLayoutPosition() >= 2 && getData().size() == helper.getLayoutPosition() + 1 && OooO00o().size() > 3) {
                    oOO00O.OooO(imageView);
                }
                if (relativeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listLayout");
                    relativeLayout = null;
                }
                oOO00O.OooO00o(relativeLayout);
                return;
            }
            if (netImageView3 != null) {
                netImageView = netImageView3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView = null;
            }
            netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0o0Oo0.o00Ooo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddTopicListActivity.OooO00o this$0 = this.f43980Oooo0o;
                    OooO0o helper2 = helper;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    Function1<? super Integer, Unit> function1 = this$0.f22279OooO0OO;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(helper2.getLayoutPosition()));
                    }
                }
            });
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutContent");
                constraintLayout = null;
            }
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o0o0Oo0.oo000o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddTopicListActivity.OooO00o this$0 = this.f44100Oooo0o;
                    OooO0o helper2 = helper;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    Function1<? super Integer, Unit> function1 = this$0.f22279OooO0OO;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(helper2.getLayoutPosition()));
                    }
                }
            });
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listLayout");
                relativeLayout = null;
            }
            oOO00O.OooO(relativeLayout);
            if (netImageView3 != null) {
                netImageView2 = netImageView3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView2 = null;
            }
            netImageView2.setImageResource(R.drawable.icon_head_default_circular);
            helper.OooO0oo(R.id.item_add_topic_list_iv_head, R.drawable.icon_head_default_circular);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f22277OooO00o);
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(topicInfoModel.getImage(), 60, 60);
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO());
            if (netImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("head");
                netImageView3 = null;
            }
            oooO00o2.OooO0o(netImageView3);
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("content");
                textView5 = null;
            }
            oOO00O.OooO00o(textView5);
            if (viewOooO0Oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("line");
                viewOooO0Oo4 = null;
            }
            oOO00O.OooO00o(viewOooO0Oo4);
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                textView4 = null;
            }
            textView4.setClickable(false);
            oOO00O.OooO00o(textView4);
            if (topicInfoModel.getIsTitleLocal()) {
                oOO00O.OooO(textView4);
                textView4.setText(o000O0O0.OooO0OO(R.string.moment_add_topic_Recommended_for_You));
            }
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("name");
                textView6 = null;
            }
            oo0o0O0.OooO00o(textView6);
            textView6.setText("");
            if (!TextUtils.isEmpty(topicInfoModel.getName())) {
                Drawable drawableOooO0O0 = topicInfoModel.isOwner() ? o000O0O0.OooO0O0(R.drawable.ic_topic_owner) : null;
                if (topicInfoModel.isManager()) {
                    drawableOooO0O0 = o000O0O0.OooO0O0(R.drawable.ic_topic_manager);
                }
                oo0o0O0.OooO0oO(textView6, drawableOooO0O0);
                textView6.setText(o0O0O00.OooO00o(topicInfoModel.getName(), this.f22281OooO0o, -16721719));
            }
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("info");
                textView8 = null;
            }
            textView8.setText(o000O0O0.OooO0OO(R.string.topic_description_hint));
            if (!TextUtils.isEmpty(topicInfoModel.getDescribe())) {
                textView8.setText(topicInfoModel.getDescribe());
            }
            if (topicFollowPostNumberView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("count");
                topicFollowPostNumberView = null;
            }
            topicFollowPostNumberView.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
            if (textView7 != null) {
                textView = textView7;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("join");
                textView = null;
            }
            oOO00O.OooO00o(textView);
            if (topicInfoModel.getIsJoin() == 1) {
                oOO00O.OooO(textView);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            OooO00o oooO00o = new OooO00o(AddTopicListActivity.this);
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            oooO00o.isUseEmpty(false);
            oooO00o.f22279OooO0OO = new com.yalla.yalla.ui.activity.moment.OooO00o(addTopicListActivity, oooO00o);
            oooO00o.f22278OooO0O0 = new com.yalla.yalla.ui.activity.moment.OooO0O0(oooO00o);
            return oooO00o;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            OooO00o oooO00o = new OooO00o(AddTopicListActivity.this);
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            oooO00o.isUseEmpty(false);
            oooO00o.f22279OooO0OO = new com.yalla.yalla.ui.activity.moment.OooO0OO(addTopicListActivity, oooO00o);
            return oooO00o;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            OooO00o oooO00o = new OooO00o(AddTopicListActivity.this);
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            oooO00o.isUseEmpty(false);
            oooO00o.f22279OooO0OO = new com.yalla.yalla.ui.activity.moment.OooO0o(addTopicListActivity, oooO00o);
            return oooO00o;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<p181o00o000.OooO> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p181o00o000.OooO invoke() {
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            Objects.requireNonNull(addTopicListActivity);
            return new p181o00o000.OooO(addTopicListActivity);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<List<TopicInfoModel>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            int i = AddTopicListActivity.f22264o0OoOo0;
            addTopicListActivity.Oooo000().setNewData(list2);
            AddTopicListActivity.this.Oooo00O().f50022OooO0OO.OooO0Oo();
            if (list2 == null || list2.isEmpty()) {
                AddTopicListActivity.this.Oooo00O().f50022OooO0OO.OooO0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            AddTopicListActivity addTopicListActivity = AddTopicListActivity.this;
            addTopicListActivity.f22274Ooooooo = true;
            addTopicListActivity.Oooo00O().f50022OooO0OO.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final OooO00o OooOoo(AddTopicListActivity addTopicListActivity) {
        return (OooO00o) addTopicListActivity.f22268OooooO0.getValue();
    }

    public static final OooO00o OooOooO(AddTopicListActivity addTopicListActivity) {
        return (OooO00o) addTopicListActivity.f22269OooooOO.getValue();
    }

    public static final void OooOooo(AddTopicListActivity activity, TopicInfoModel topicInfoModel) {
        Objects.requireNonNull(activity);
        if (topicInfoModel == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        BaseActivityK.OooOoo0(activity, null, 0L, 3, null);
        activity.Oooo0O0().circleUserVerify(topicInfoModel.getId()).observe(activity, new o0o0000.OooOo(new oo0o0Oo(activity, topicInfoModel), p538o0o0Oo0.o0O0O00.f44007Oooo0o, new o000OOo(activity), false, 8));
    }

    public final p181o00o000.OooO Oooo0() {
        return (p181o00o000.OooO) this.f22266Ooooo00.getValue();
    }

    public final OooO00o Oooo000() {
        return (OooO00o) this.f22270OooooOo.getValue();
    }

    public final mc Oooo00O() {
        return (mc) this.f22265OoooOoo.getValue();
    }

    public final ConcatAdapter Oooo00o() {
        return (ConcatAdapter) this.f22272Oooooo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentTopicVM Oooo0O0() {
        return (MomentTopicVM) this.f22267Ooooo0o.getValue();
    }

    public final void Oooo0OO(String str) {
        OooO00o oooO00oOooo000 = Oooo000();
        String maskKey = this.f22271Oooooo;
        Objects.requireNonNull(oooO00oOooo000);
        Intrinsics.checkNotNullParameter(maskKey, "maskKey");
        oooO00oOooo000.f22281OooO0o = maskKey;
        if (!StringsKt.isBlank(str)) {
            Oooo00O().f50021OooO0O0.setAdapter(Oooo000());
            if (StringsKt.isBlank(this.f22271Oooooo)) {
                Oooo00O().f50022OooO0OO.OooO0oo();
            }
            this.f22271Oooooo = str;
            Oooo0O0().circleSearch(str).observe(this, new o0o0000.OooOo(new OooOO0O(), new OooOOO0(), null, false, 12));
            return;
        }
        Oooo00O().f50021OooO0O0.setAdapter(Oooo00o());
        Oooo00O().f50022OooO0OO.OooO0Oo();
        if (!this.f22274Ooooooo || Oooo00o().getItemCount() >= 1) {
            return;
        }
        Oooo00O().f50022OooO0OO.OooO0o0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        o0O00000.OooO0OO("Moemnts_post_topic_quite");
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo00O().f50020OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(R.string.Add_a_topic));
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(new o00oO0o(this));
        }
        p181o00o000.OooO oooOOooo0 = Oooo0();
        String string = getString(R.string.Search_topics);
        EditText editText = oooOOooo0.f32947OoooO0;
        if (editText != null) {
            editText.setHint(string);
            oooOOooo0.f32947OoooO0.setText("");
        }
        View view = oooOOooo0.f32949OoooOO0;
        if (view != null) {
            view.setVisibility(8);
            oooOOooo0.f32949OoooOO0.setVisibility(0);
        }
        Oooo0().f32160Oooo = new p074o000O0oo.OooOOO0(this);
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.f22273OoooooO);
        Oooo0().f32947OoooO0.setFilters(new InputFilter[]{new p168o00Ooo0.o000OOo(), lengthFilter});
        Oooo00O().f50021OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        Oooo00O().f50022OooO0OO.setEmptyImage(R.drawable.ic_empty_message_system);
        Oooo00O().f50022OooO0OO.setEmptyText(o000O0O0.OooO0OO(R.string.No_search_results));
        StateLayout stateLayout = Oooo00O().f50022OooO0OO;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new o0ooOOo(this), 3);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o0OOO0o(this, null), 2, null);
        Oooo00O().f50022OooO0OO.OooO0oo();
        Oooo0O0().circlePersonRecommendList().observe(this, new o0o0000.OooOo(new o0Oo0oo(this), null, new o0OO00O(this), false, 10));
        Oooo00O().f50021OooO0O0.setAdapter(Oooo00o());
        Oooo0O0().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo0O0().statisticalTime();
        Objects.requireNonNull(Oooo0());
        o00O0O0.OooO0O0().OooO00o();
    }
}
