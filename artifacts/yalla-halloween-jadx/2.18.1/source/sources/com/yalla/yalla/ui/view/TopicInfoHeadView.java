package com.yalla.yalla.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o00OO0O0.o000000O;
import o00OO0O0.o00000O;
import o00OO0O0.o00000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p582o0oOoOoO.j3;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.gj;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicInfoHeadView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/TopicInfoModel;", "topicInfo", "", "setTopicInfo", "", "it", "setTopicHead", "setTopicDesc", "setTopicRule", "", "Lcom/yalla/yalla/common/db/table/UserInfo;", "userList", "setManagerList", "Lo00o00o0/OooO0OO;", "Oooo0oO", "Lkotlin/Lazy;", "getManagerAdapter", "()Lo00o00o0/OooO0OO;", "managerAdapter", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicInfoHeadView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f25226Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final gj f25227Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy managerAdapter;

    public static final class OooO00o extends Lambda implements Function0<OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f25229Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f25229Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO invoke() {
            return new OooO(this.f25229Oooo0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            if (str2 == null) {
                return null;
            }
            TopicInfoHeadView.this.f25227Oooo0o.f49508OooO0oO.setName(str2);
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicInfoHeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicInfoHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TopicInfoHeadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public static void OooO00o(TopicInfoModel topicInfoModel, TopicInfoHeadView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        oooO00o.OooO00o(context, topicInfoModel.getId(), topicInfoModel.getMaxAdminCount(), this$0.getManagerAdapter().getData());
    }

    public static void OooO0O0(Context context, TopicInfoHeadView this$0, int i) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, (Activity) context, String.valueOf(this$0.getManagerAdapter().getData().get(i).getUserId()), false, 12);
    }

    private final p188o00o00o0.OooO0OO<UserInfo> getManagerAdapter() {
        return (p188o00o00o0.OooO0OO) this.managerAdapter.getValue();
    }

    public final void OooO0OO(@NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        getManagerAdapter().addData(userInfo);
    }

    public final void OooO0Oo(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<UserInfo> data = getManagerAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "managerAdapter.data");
        Iterator<UserInfo> it = data.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(userId, com.yalla.support.common.util.OooO.OooO(Long.valueOf(it.next().getUserId()), ""))) {
                getManagerAdapter().remove(i);
            }
            i++;
        }
        i = -1;
        getManagerAdapter().remove(i);
    }

    public final void setManagerList(@NotNull List<UserInfo> userList) {
        Intrinsics.checkNotNullParameter(userList, "userList");
        getManagerAdapter().setNewData(userList);
        p188o00o00o0.OooO0OO<UserInfo> managerAdapter = getManagerAdapter();
        Boolean bool = Boolean.TRUE;
        managerAdapter.setLoadComplete(bool, bool, bool);
    }

    public final void setTopicDesc(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25227Oooo0o.f49515OooOOOO.setText(it);
    }

    public final void setTopicHead(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.f48429OooO0OO = it;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO());
        oooO00o.OooO0oO(4);
        oooO00o.OooO0o(this.f25227Oooo0o.f49507OooO0o0);
    }

    public final void setTopicInfo(@Nullable final TopicInfoModel topicInfo) {
        if (topicInfo == null) {
            LinearLayout linearLayout = this.f25227Oooo0o.f49502OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
            o00O0O.OooO00o(linearLayout);
            return;
        }
        LinearLayout linearLayout2 = this.f25227Oooo0o.f49502OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.root");
        o00O0O.OooO(linearLayout2);
        setTopicHead(topicInfo.getImage());
        this.f25227Oooo0o.f49517OooOOo0.setText(topicInfo.getName());
        this.f25227Oooo0o.f49512OooOO0o.setText(OooOOO.OooO0OO(R.string.languge) + ':');
        this.f25227Oooo0o.f49503OooO0O0.setLanguage(topicInfo.getRegion());
        setTopicDesc(topicInfo.getDescribe());
        setTopicRule(topicInfo.getRule());
        int i = 1;
        if (topicInfo.isOwner()) {
            View view = this.f25227Oooo0o.f49510OooOO0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.tvAdminManagerTopView");
            o00O0O.OooO0oO(view, true);
            View view2 = this.f25227Oooo0o.f49501OooO;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.tvAdminManagerBottomView");
            o00O0O.OooO0oO(view2, true);
            TextView textView = this.f25227Oooo0o.f49509OooO0oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvAdminManager");
            o00O0O.OooO0oO(textView, true);
            LinearLayout linearLayout3 = this.f25227Oooo0o.f49504OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.layoutTopicManager");
            o00O0O.OooO0oO(linearLayout3, true);
            List<UserInfo> data = getManagerAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data, "managerAdapter.data");
            if (!data.isEmpty()) {
                View view3 = this.f25227Oooo0o.f49510OooOO0;
                Intrinsics.checkNotNullExpressionValue(view3, "binding.tvAdminManagerTopView");
                o00O0O.OooO0oO(view3, false);
                View view4 = this.f25227Oooo0o.f49501OooO;
                Intrinsics.checkNotNullExpressionValue(view4, "binding.tvAdminManagerBottomView");
                o00O0O.OooO0oO(view4, false);
            }
        } else {
            View view5 = this.f25227Oooo0o.f49510OooOO0;
            Intrinsics.checkNotNullExpressionValue(view5, "binding.tvAdminManagerTopView");
            o00O0O.OooO0oO(view5, false);
            View view6 = this.f25227Oooo0o.f49501OooO;
            Intrinsics.checkNotNullExpressionValue(view6, "binding.tvAdminManagerBottomView");
            o00O0O.OooO0oO(view6, false);
            TextView textView2 = this.f25227Oooo0o.f49509OooO0oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvAdminManager");
            o00O0O.OooO0oO(textView2, false);
            LinearLayout linearLayout4 = this.f25227Oooo0o.f49504OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.layoutTopicManager");
            o00O0O.OooO0oO(linearLayout4, false);
            List<UserInfo> data2 = getManagerAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data2, "managerAdapter.data");
            if (!data2.isEmpty()) {
                LinearLayout linearLayout5 = this.f25227Oooo0o.f49504OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.layoutTopicManager");
                o00O0O.OooO0oO(linearLayout5, true);
            }
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.f48429OooO0OO = topicInfo.getHeadUrl();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o.OooO0o(this.f25227Oooo0o.f49506OooO0o);
        long userId = topicInfo.getUserId();
        UserTagView tagView = this.f25227Oooo0o.f49508OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tagView, "binding.ownerUserTagView");
        String defaultValue = topicInfo.getNickName();
        OooO0O0 block = new OooO0O0();
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0o0O0O0.o00O0O.OooO0O0(userId, defaultValue, tagView, block, null), 2, null);
        this.f25227Oooo0o.f49508OooO0oO.setSex(topicInfo.getSex());
        this.f25227Oooo0o.f49508OooO0oO.setIdentityTopic(1);
        this.f25227Oooo0o.f49508OooO0oO.OooO0o(topicInfo.getVip(), topicInfo.getVipLevel());
        this.f25227Oooo0o.f49508OooO0oO.setKaVip(topicInfo.getKaVIPLv());
        this.f25227Oooo0o.f49508OooO0oO.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.oO000O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                TopicInfoModel topicInfoModel = topicInfo;
                TopicInfoHeadView this$0 = this;
                int i2 = TopicInfoHeadView.f25226Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long userId2 = topicInfoModel.getUserId();
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0Oo(oooO00o2, (Activity) context, String.valueOf(userId2), false, 12);
            }
        });
        this.f25227Oooo0o.f49506OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.oO000O0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                TopicInfoModel topicInfoModel = topicInfo;
                TopicInfoHeadView this$0 = this;
                int i2 = TopicInfoHeadView.f25226Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long userId2 = topicInfoModel.getUserId();
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0Oo(oooO00o2, (Activity) context, String.valueOf(userId2), false, 12);
            }
        });
        this.f25227Oooo0o.f49516OooOOOo.setOnClickListener(new j3(this, 1));
        this.f25227Oooo0o.f49509OooO0oo.setOnClickListener(new o000000O(topicInfo, this, i));
    }

    public final void setTopicRule(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25227Oooo0o.f49514OooOOO0.setText(it);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicInfoHeadView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        gj gjVarInflate = gj.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(gjVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25227Oooo0o = gjVarInflate;
        this.managerAdapter = LazyKt.lazy(new OooO00o(context));
        TextView textView = gjVarInflate.f49511OooOO0O;
        int i2 = 2;
        textView.setOnClickListener(new o00000OO(this, textView, i2));
        TextView textView2 = gjVarInflate.f49513OooOOO;
        textView2.setOnClickListener(new o00000O(this, textView2, i2));
        gjVarInflate.f49505OooO0Oo.setLayoutManager(new FixLinearLayoutManager(context));
        getManagerAdapter().hindEmptyView(true);
        getManagerAdapter().setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0oo00Oo.oO0Ooooo
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i3) {
                TopicInfoHeadView.OooO0O0(context, this, i3);
            }
        });
        gjVarInflate.f49505OooO0Oo.setAdapter(getManagerAdapter());
    }
}
