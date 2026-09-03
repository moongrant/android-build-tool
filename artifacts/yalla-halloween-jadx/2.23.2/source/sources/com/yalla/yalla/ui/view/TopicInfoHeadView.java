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
import o000OOO.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.q3;
import p412o0Oo0o0O.o000O0o;
import p423o0OoO0OO.o00O0O0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p587o0oOooOO.p2;
import p642o0ooOOO0.d1;
import p643o0ooOOOO.f3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicInfoHeadView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicInfo", "", "setTopicInfo", "", "it", "setTopicHead", "setTopicDesc", "setTopicRule", "", "Lcom/yalla/yalla/data/db/table/UserInfo;", "userList", "setManagerList", "Landroidx/fragment/app/FragmentActivity;", "OooO0Oo", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "activity", "Lo0oOoO0/o0000oo;", "OooO0o", "Lkotlin/Lazy;", "getManagerAdapter", "()Lo0oOoO0/o0000oo;", "managerAdapter", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicInfoHeadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoHeadView.kt\ncom/yalla/yalla/ui/view/TopicInfoHeadView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n350#2,7:192\n1#3:199\n*S KotlinDebug\n*F\n+ 1 TopicInfoHeadView.kt\ncom/yalla/yalla/ui/view/TopicInfoHeadView\n*L\n185#1:192,7\n*E\n"})
public final class TopicInfoHeadView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30230OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FragmentActivity activity;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy managerAdapter;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final q3 f30233OooO0o0;

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
            TopicInfoHeadView.this.f30233OooO0o0.f45419OooO0oO.setName(str2);
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O f30235OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O o000o) {
            super(0);
            this.f30235OooO0Oo = o000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f30235OooO0Oo.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicInfoHeadView(TopicInfoActivity activity) {
        super(activity, null, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        q3 q3VarInflate = q3.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(q3VarInflate, "inflate(...)");
        this.f30233OooO0o0 = q3VarInflate;
        this.managerAdapter = LazyKt.lazy(new p2(this));
        final TextView textView = q3VarInflate.f45422OooOO0O;
        textView.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30230OooO0oO;
                TopicInfoHeadView this$0 = this.f56844OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView this_apply = textView;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int maxLines = this$0.f30233OooO0o0.f45426OooOOOO.getMaxLines();
                q3 q3Var = this$0.f30233OooO0o0;
                if (maxLines == 2) {
                    o00O0O0O.OooO0o(this_apply, o0000.OooO0O0(o0Oo0oo.icon_arrow_top_gray));
                    q3Var.f45426OooOOOO.setMaxLines(Integer.MAX_VALUE);
                } else {
                    o00O0O0O.OooO0o(this_apply, o0000.OooO0O0(o0Oo0oo.icon_arrow_bottom_gray));
                    q3Var.f45426OooOOOO.setMaxLines(2);
                }
            }
        });
        TextView textView2 = q3VarInflate.f45424OooOOO;
        textView2.setOnClickListener(new f3(1, this, textView2));
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(getContext());
        RecyclerView recyclerView = q3VarInflate.f45416OooO0Oo;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        getManagerAdapter().OooOoOO(true);
        getManagerAdapter().f13176OooO0o = new OooOOO0(this);
        recyclerView.setAdapter(getManagerAdapter());
    }

    public static void OooO00o(TopicInfoHeadView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this$0.activity, String.valueOf(this$0.getManagerAdapter().f13189OooOOoo.get(i).getUserId()), false, 12);
    }

    public static void OooO0O0(TopicInfoModel topicInfoModel, TopicInfoHeadView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = TopicManagerActivity.f25931OooOoO;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        long id = topicInfoModel.getId();
        int maxAdminCount = topicInfoModel.getMaxAdminCount();
        List<UserInfo> list = this$0.getManagerAdapter().f13189OooOOoo;
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

    private final o0000oo<UserInfo> getManagerAdapter() {
        return (o0000oo) this.managerAdapter.getValue();
    }

    public final void OooO0OO(@NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        getManagerAdapter().OooO0OO(userInfo);
    }

    public final void OooO0Oo(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        List<UserInfo> list = getManagerAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
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
        o0000oo<UserInfo> managerAdapter = getManagerAdapter();
        Boolean bool = Boolean.TRUE;
        managerAdapter.Oooo0(bool, bool, bool);
    }

    public final void setTopicDesc(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f30233OooO0o0.f45426OooOOOO.setText(it);
    }

    public final void setTopicHead(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
        oooO00o.f43126OooO0OO = it;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0oO());
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(this.f30233OooO0o0.f45418OooO0o0);
    }

    public final void setTopicInfo(@Nullable final TopicInfoModel topicInfo) {
        q3 q3Var = this.f30233OooO0o0;
        if (topicInfo == null) {
            LinearLayout linearLayout = q3Var.f45413OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
            com.code.android.util.o000O.OooO0O0(linearLayout);
            return;
        }
        LinearLayout linearLayout2 = q3Var.f45413OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
        com.code.android.util.o000O.OooOOOO(linearLayout2);
        setTopicHead(topicInfo.getImage());
        q3Var.f45428OooOOo0.setText(topicInfo.getName());
        q3Var.f45423OooOO0o.setText(OooOOOO.OooO00o(o0000.OooO0OO(o000000.languge), CertificateUtil.DELIMITER));
        q3Var.f45414OooO0O0.setLanguage(topicInfo.getRegion());
        setTopicDesc(topicInfo.getDescribe());
        setTopicRule(topicInfo.getRule());
        boolean zIsOwner = topicInfo.isOwner();
        LinearLayout layoutTopicManager = q3Var.f45415OooO0OO;
        TextView tvAdminManager = q3Var.f45420OooO0oo;
        View tvAdminManagerBottomView = q3Var.f45412OooO;
        View tvAdminManagerTopView = q3Var.f45421OooOO0;
        if (zIsOwner) {
            Intrinsics.checkNotNullExpressionValue(tvAdminManagerTopView, "tvAdminManagerTopView");
            com.code.android.util.o000O.OooOOO0(tvAdminManagerTopView, true);
            Intrinsics.checkNotNullExpressionValue(tvAdminManagerBottomView, "tvAdminManagerBottomView");
            com.code.android.util.o000O.OooOOO0(tvAdminManagerBottomView, true);
            Intrinsics.checkNotNullExpressionValue(tvAdminManager, "tvAdminManager");
            com.code.android.util.o000O.OooOOO0(tvAdminManager, true);
            Intrinsics.checkNotNullExpressionValue(layoutTopicManager, "layoutTopicManager");
            com.code.android.util.o000O.OooOOO0(layoutTopicManager, true);
            List<UserInfo> list = getManagerAdapter().f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
            if (!list.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(tvAdminManagerTopView, "tvAdminManagerTopView");
                com.code.android.util.o000O.OooOOO0(tvAdminManagerTopView, false);
                Intrinsics.checkNotNullExpressionValue(tvAdminManagerBottomView, "tvAdminManagerBottomView");
                com.code.android.util.o000O.OooOOO0(tvAdminManagerBottomView, false);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(tvAdminManagerTopView, "tvAdminManagerTopView");
            com.code.android.util.o000O.OooOOO0(tvAdminManagerTopView, false);
            Intrinsics.checkNotNullExpressionValue(tvAdminManagerBottomView, "tvAdminManagerBottomView");
            com.code.android.util.o000O.OooOOO0(tvAdminManagerBottomView, false);
            Intrinsics.checkNotNullExpressionValue(tvAdminManager, "tvAdminManager");
            com.code.android.util.o000O.OooOOO0(tvAdminManager, false);
            Intrinsics.checkNotNullExpressionValue(layoutTopicManager, "layoutTopicManager");
            com.code.android.util.o000O.OooOOO0(layoutTopicManager, false);
            List<UserInfo> list2 = getManagerAdapter().f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list2, "getData(...)");
            if (!list2.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(layoutTopicManager, "layoutTopicManager");
                com.code.android.util.o000O.OooOOO0(layoutTopicManager, true);
            }
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
        oooO00o.f43126OooO0OO = topicInfo.getHeadUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        NetImageView netImageView = q3Var.f45417OooO0o;
        oooO00o.OooO0Oo(netImageView);
        long userId = topicInfo.getUserId();
        UserTagView tagView = q3Var.f45419OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tagView, "ownerUserTagView");
        String defaultValue = topicInfo.getNickName();
        OooO00o block = new OooO00o();
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(o0OO00O.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(topicInfo.getSex());
        tagView.setIdentityTopic(1);
        tagView.OooO0oO(topicInfo.getVip(), topicInfo.getVipLevel());
        tagView.OooO0Oo(topicInfo.getKaVIPLv(), true, this.activity);
        tagView.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30230OooO0oO;
                TopicInfoHeadView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this$0.activity, String.valueOf(topicInfo.getUserId()), false, 12);
            }
        });
        netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30230OooO0oO;
                TopicInfoHeadView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this$0.activity, String.valueOf(topicInfo.getUserId()), false, 12);
            }
        });
        q3Var.f45427OooOOOo.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TopicInfoHeadView.f30230OooO0oO;
                TopicInfoHeadView this$0 = this.f56867OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                o000O o000o = new o000O(context);
                o000o.OooOoO(o0000.OooO0OO(o000000.topic_info_dialog_title));
                o000o.OooOo00(o0000.OooO0OO(o000000.topic_info_dialog_content));
                o000o.OooOo0(new TopicInfoHeadView.OooO0O0(o000o));
                o000o.OooOO0o();
            }
        });
        tvAdminManager.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicInfoHeadView.OooO0O0(topicInfo, this);
            }
        });
    }

    public final void setTopicRule(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f30233OooO0o0.f45425OooOOO0.setText(it);
    }
}
