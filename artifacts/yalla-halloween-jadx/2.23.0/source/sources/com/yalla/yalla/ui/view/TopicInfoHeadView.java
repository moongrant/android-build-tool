package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0OO0O;
import p417o0OoO0.o000O0o;
import p539o0o0OoOO.k3;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.bc;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicInfoHeadView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicInfo", "", "setTopicInfo", "", "it", "setTopicHead", "setTopicDesc", "setTopicRule", "", "Lcom/yalla/yalla/data/db/table/UserInfo;", "userList", "setManagerList", "Landroidx/fragment/app/FragmentActivity;", "OooO0Oo", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "activity", "Lo0oOo0OO/o000O;", "OooO0o", "Lkotlin/Lazy;", "getManagerAdapter", "()Lo0oOo0OO/o000O;", "managerAdapter", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicInfoHeadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoHeadView.kt\ncom/yalla/yalla/ui/view/TopicInfoHeadView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n350#2,7:192\n1#3:199\n*S KotlinDebug\n*F\n+ 1 TopicInfoHeadView.kt\ncom/yalla/yalla/ui/view/TopicInfoHeadView\n*L\n185#1:192,7\n*E\n"})
public final class TopicInfoHeadView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30775OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FragmentActivity activity;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy managerAdapter;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final bc f30778OooO0o0;

    @SourceDebugExtension({"SMAP\nTopicInfoHeadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoHeadView.kt\ncom/yalla/yalla/ui/view/TopicInfoHeadView$setTopicInfo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<String, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            if (str2 == null) {
                return null;
            }
            TopicInfoHeadView.this.f30778OooO0o0.f57621OooO0oO.setName(str2);
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f30780OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO00O o0oo00o2) {
            super(0);
            this.f30780OooO0Oo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f30780OooO0Oo.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicInfoHeadView(TopicInfoActivity activity) {
        super(activity, null, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        bc bcVarInflate = bc.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(bcVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30778OooO0o0 = bcVarInflate;
        this.managerAdapter = LazyKt.lazy(new k3(this));
        final TextView textView = bcVarInflate.f57624OooOO0O;
        textView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30775OooO0oO;
                TopicInfoHeadView this$0 = this.f55534OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView this_apply = textView;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int maxLines = this$0.f30778OooO0o0.f57628OooOOOO.getMaxLines();
                bc bcVar = this$0.f30778OooO0o0;
                if (maxLines == 2) {
                    o000O0o.OooO0o(this_apply, o0000.OooO0O0(oOo00OO0.icon_arrow_top_gray));
                    bcVar.f57628OooOOOO.setMaxLines(Integer.MAX_VALUE);
                } else {
                    o000O0o.OooO0o(this_apply, o0000.OooO0O0(oOo00OO0.icon_arrow_bottom_gray));
                    bcVar.f57628OooOOOO.setMaxLines(2);
                }
            }
        });
        final TextView textView2 = bcVarInflate.f57626OooOOO;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.f3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30775OooO0oO;
                TopicInfoHeadView this$0 = this.f55542OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView this_apply = textView2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int maxLines = this$0.f30778OooO0o0.f57627OooOOO0.getMaxLines();
                bc bcVar = this$0.f30778OooO0o0;
                if (maxLines == 2) {
                    o000O0o.OooO0o(this_apply, o0000.OooO0O0(oOo00OO0.icon_arrow_top_gray));
                    bcVar.f57627OooOOO0.setMaxLines(Integer.MAX_VALUE);
                } else {
                    o000O0o.OooO0o(this_apply, o0000.OooO0O0(oOo00OO0.icon_arrow_bottom_gray));
                    bcVar.f57627OooOOO0.setMaxLines(2);
                }
            }
        });
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(getContext());
        RecyclerView recyclerView = bcVarInflate.f57618OooO0Oo;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        getManagerAdapter().OooOoOO(true);
        getManagerAdapter().f10098OooO0o = new com.yalla.yalla.ui.fragment.OooO00o(this);
        recyclerView.setAdapter(getManagerAdapter());
    }

    public static void OooO00o(TopicInfoHeadView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.activity, String.valueOf(this$0.getManagerAdapter().f10111OooOOoo.get(i).getUserId()), false, 12);
    }

    public static void OooO0O0(TopicInfoModel topicInfoModel, TopicInfoHeadView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = TopicManagerActivity.f26382OooOoO;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        long id = topicInfoModel.getId();
        int maxAdminCount = topicInfoModel.getMaxAdminCount();
        List<UserInfo> list = this$0.getManagerAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((UserInfo) it.next());
            }
        }
        Intent intent = new Intent(context, (Class<?>) TopicManagerActivity.class);
        intent.putExtra("TopicId", id);
        intent.putExtra("Max_Admin_Count", maxAdminCount);
        intent.putExtra("User_List", arrayList);
        context.startActivity(intent);
    }

    private final o000O<UserInfo> getManagerAdapter() {
        return (o000O) this.managerAdapter.getValue();
    }

    public final void OooO0OO(@NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        getManagerAdapter().OooO0OO(userInfo);
    }

    public final void OooO0Oo(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<UserInfo> list = getManagerAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "managerAdapter.data");
        Iterator<UserInfo> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(userId, o0OoOo0.OooOOO0("", Long.valueOf(it.next().getUserId())))) {
                getManagerAdapter().OooOOo(i);
            }
            i++;
        }
        i = -1;
        getManagerAdapter().OooOOo(i);
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final void setManagerList(@NotNull List<UserInfo> userList) {
        Intrinsics.checkNotNullParameter(userList, "userList");
        getManagerAdapter().OooOoO0(userList);
        o000O<UserInfo> managerAdapter = getManagerAdapter();
        Boolean bool = Boolean.TRUE;
        managerAdapter.Oooo0(bool, bool, bool);
    }

    public final void setTopicDesc(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f30778OooO0o0.f57628OooOOOO.setText(it);
    }

    public final void setTopicHead(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
        oooO00o.f43911OooO0OO = it;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(this.f30778OooO0o0.f57620OooO0o0);
    }

    public final void setTopicInfo(@Nullable final TopicInfoModel topicInfo) {
        bc bcVar = this.f30778OooO0o0;
        if (topicInfo == null) {
            LinearLayout linearLayout = bcVar.f57615OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
            o000OO00.OooO0O0(linearLayout);
            return;
        }
        LinearLayout linearLayout2 = bcVar.f57615OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.root");
        o000OO00.OooOOOO(linearLayout2);
        setTopicHead(topicInfo.getImage());
        bcVar.f57630OooOOo0.setText(topicInfo.getName());
        bcVar.f57625OooOO0o.setText(OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.languge), CertificateUtil.DELIMITER));
        bcVar.f57616OooO0O0.setLanguage(topicInfo.getRegion());
        setTopicDesc(topicInfo.getDescribe());
        setTopicRule(topicInfo.getRule());
        boolean zIsOwner = topicInfo.isOwner();
        LinearLayout linearLayout3 = bcVar.f57617OooO0OO;
        TextView textView = bcVar.f57622OooO0oo;
        View view = bcVar.f57614OooO;
        View view2 = bcVar.f57623OooOO0;
        if (zIsOwner) {
            Intrinsics.checkNotNullExpressionValue(view2, "binding.tvAdminManagerTopView");
            o000OO00.OooOOO0(view2, true);
            Intrinsics.checkNotNullExpressionValue(view, "binding.tvAdminManagerBottomView");
            o000OO00.OooOOO0(view, true);
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvAdminManager");
            o000OO00.OooOOO0(textView, true);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.layoutTopicManager");
            o000OO00.OooOOO0(linearLayout3, true);
            List<UserInfo> list = getManagerAdapter().f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "managerAdapter.data");
            if (!list.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(view2, "binding.tvAdminManagerTopView");
                o000OO00.OooOOO0(view2, false);
                Intrinsics.checkNotNullExpressionValue(view, "binding.tvAdminManagerBottomView");
                o000OO00.OooOOO0(view, false);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(view2, "binding.tvAdminManagerTopView");
            o000OO00.OooOOO0(view2, false);
            Intrinsics.checkNotNullExpressionValue(view, "binding.tvAdminManagerBottomView");
            o000OO00.OooOOO0(view, false);
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvAdminManager");
            o000OO00.OooOOO0(textView, false);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.layoutTopicManager");
            o000OO00.OooOOO0(linearLayout3, false);
            List<UserInfo> list2 = getManagerAdapter().f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list2, "managerAdapter.data");
            if (!list2.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.layoutTopicManager");
                o000OO00.OooOOO0(linearLayout3, true);
            }
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
        oooO00o.f43911OooO0OO = topicInfo.getHeadUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        NetImageView netImageView = bcVar.f57619OooO0o;
        oooO00o.OooO0Oo(netImageView);
        long userId = topicInfo.getUserId();
        UserTagView tagView = bcVar.f57621OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tagView, "binding.ownerUserTagView");
        String defaultValue = topicInfo.getNickName();
        OooO00o block = new OooO00o();
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(topicInfo.getSex());
        tagView.setIdentityTopic(1);
        tagView.OooO0oO(topicInfo.getVip(), topicInfo.getVipLevel());
        tagView.OooO0Oo(topicInfo.getKaVIPLv(), true, this.activity);
        tagView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i = TopicInfoHeadView.f30775OooO0oO;
                TopicInfoHeadView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.activity, String.valueOf(topicInfo.getUserId()), false, 12);
            }
        });
        netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.h3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i = TopicInfoHeadView.f30775OooO0oO;
                TopicInfoHeadView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0.activity, String.valueOf(topicInfo.getUserId()), false, 12);
            }
        });
        bcVar.f57629OooOOOo.setOnClickListener(new com.yalla.yalla.ui.fragment.OooO0O0(this, 1));
        textView.setOnClickListener(new com.twitter.sdk.android.tweetui.OooO0OO(1, topicInfo, this));
    }

    public final void setTopicRule(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f30778OooO0o0.f57627OooOOO0.setText(it);
    }
}
