package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO0O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.adapter.o0O0ooO;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p289o0O0Oo0.o000O0O0;
import p289o0O0Oo0.o000O0Oo;
import p384o0OOoo0O.o00oO0o;
import p405o0Oo0OOO.z1;
import p423o0OoO0OO.o0000OO0;
import p506o0o00oOo.u0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoTagActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserInfoTagActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoTagActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoTagActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,454:1\n22#2,2:455\n75#3,13:457\n*S KotlinDebug\n*F\n+ 1 UserInfoTagActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoTagActivity\n*L\n37#1:455,2\n38#1:457,13\n*E\n"})
public final class UserInfoTagActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f26868Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TagListModel f26873OooOo0O;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ArrayList<TagListModel.TagInfo> f26879OooOoo0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f26882Oooo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26869OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(z1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26872OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoTagActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoTagActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoTagActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26894OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26894OooO0Oo;
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
    public final Lazy f26871OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26874OooOo0o = -1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f26870OooOo = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26876OooOoO0 = -1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f26875OooOoO = -1;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final int[] f26877OooOoOO = {o0Oo0oo.shape_bg_userinfo_tag_1, o0Oo0oo.shape_bg_userinfo_tag_2, o0Oo0oo.shape_bg_userinfo_tag_3, o0Oo0oo.shape_bg_userinfo_tag_4, o0Oo0oo.shape_bg_userinfo_tag_5, o0Oo0oo.shape_bg_userinfo_tag_6};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ArrayList<TagListModel.TagInfo> f26878OooOoo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final SparseArray<TagListModel.TagInfo> f26880OooOooO = new SparseArray<>();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final SparseArray<Integer> f26881OooOooo = new SparseArray<>();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f26883Oooo000 = 6;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f26884Oooo00O = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f26885Oooo00o = true;

    public static final class OooO extends Lambda implements Function0<TextView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            UserInfoTagActivity userInfoTagActivity = UserInfoTagActivity.this;
            HeaderLayout headerLayout = userInfoTagActivity.f22282OooOO0;
            if (headerLayout != null) {
                return headerLayout.OooOoO0(o000000.Save, new o0OoOo0(userInfoTagActivity));
            }
            return null;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<o000oOoO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000oOoO invoke() {
            return new o000oOoO(UserInfoTagActivity.this, oo0o0Oo.item_useirnfo_edit_tags);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoTagActivity.OooOoO(UserInfoTagActivity.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoTagActivity.this.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<TagListModel.TagInfo, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f26890OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(TagListModel.TagInfo tagInfo) {
            TagListModel.TagInfo data = tagInfo;
            Intrinsics.checkNotNullParameter(data, "data");
            return Integer.valueOf(data.tagId);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<TagListModel.TagInfo, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f26891OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(TagListModel.TagInfo tagInfo) {
            TagListModel.TagInfo data = tagInfo;
            Intrinsics.checkNotNullParameter(data, "data");
            return Integer.valueOf(data.tagId);
        }
    }

    public static final boolean OooOo(UserInfoTagActivity userInfoTagActivity, int i) {
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f26879OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.tagId == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoO(UserInfoTagActivity userInfoTagActivity) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f26879OooOoo0;
        if (arrayList != null) {
            Iterator<TagListModel.TagInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().tagId);
                stringBuffer.append(",");
            }
        }
        if (stringBuffer.length() > 1) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        } else {
            stringBuffer.append("-1");
        }
        p384o0OOoo0O.o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) userInfoTagActivity.f26872OooOo00.getValue(), null, null, null, stringBuffer.toString(), null, null, null, null, 247, null), userInfoTagActivity, false, null, null, new u0(userInfoTagActivity), 14);
    }

    public static final boolean OooOoO0(UserInfoTagActivity userInfoTagActivity, TagListModel.TagType tagType) {
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f26879OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.typeId == tagType.tagId) {
                return true;
            }
        }
        return false;
    }

    public final o0000oo<TagListModel.TagType> OooOoOO() {
        return (o0000oo) this.f26871OooOo0.getValue();
    }

    public final TagListModel.TagInfo OooOoo(int i) {
        ArrayList<TagListModel.TagInfo> arrayList = this.f26879OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.tagId == i) {
                return tagInfo;
            }
        }
        return null;
    }

    public final z1 OooOoo0() {
        return (z1) this.f26869OooOOoo.getValue();
    }

    public final void OooOooO(int i) {
        int size;
        if (this.f26876OooOoO0 == i) {
            return;
        }
        if (this.f26874OooOo0o == i) {
            this.f26870OooOo = -1;
            this.f26875OooOoO = -1;
            OooOoOO().notifyItemChanged(this.f26874OooOo0o);
            this.f26874OooOo0o = -1;
            TagListModel tagListModel = this.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f26876OooOoO0);
            OooOoOO().notifyItemRemoved(this.f26876OooOoO0);
            this.f26876OooOoO0 = -1;
            Oooo00O();
            return;
        }
        this.f26870OooOo = i;
        OooOoOO().notifyItemChanged(this.f26874OooOo0o);
        OooOoOO().notifyItemChanged(this.f26870OooOo);
        int i2 = this.f26876OooOoO0;
        if (i2 != -1 && i > i2) {
            i--;
        }
        if (i2 == -1) {
            TagListModel tagListModel2 = this.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel2);
            size = tagListModel2.data.size();
        } else {
            TagListModel tagListModel3 = this.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel3);
            size = tagListModel3.data.size() - 1;
        }
        int i3 = (i + 4) - (i % 4);
        if (i3 <= size) {
            size = i3;
        }
        int i4 = this.f26876OooOoO0;
        if (i4 == -1) {
            this.f26875OooOoO = size;
            TagListModel tagListModel4 = this.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel4);
            tagListModel4.data.add(size, new TagListModel.TagType());
            OooOoOO().notifyItemInserted(size);
            Oooo00O();
            return;
        }
        if (size == i4) {
            this.f26875OooOoO = size;
            OooOoOO().notifyItemChanged(size);
            Oooo00O();
            return;
        }
        TagListModel tagListModel5 = this.f26873OooOo0O;
        Intrinsics.checkNotNull(tagListModel5);
        tagListModel5.data.remove(this.f26876OooOoO0);
        OooOoOO().notifyItemRemoved(this.f26876OooOoO0);
        if (size > this.f26876OooOoO0) {
            this.f26870OooOo--;
        }
        this.f26875OooOoO = size;
        TagListModel tagListModel6 = this.f26873OooOo0O;
        Intrinsics.checkNotNull(tagListModel6);
        tagListModel6.data.add(size, new TagListModel.TagType());
        OooOoOO().notifyItemInserted(size);
        Oooo00O();
    }

    public final void OooOooo() {
        ArrayList<TagListModel.TagInfo> arrayList = this.f26879OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        String str = arrayList.size() + "/6";
        OooOoo0().f45730OooO0o.setText(o0000.OooO0OO(o000000.Tag_edit_selected_tag) + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
    }

    public final void Oooo000() {
        if (com.code.android.util.OooOo00.OooO0O0(this.f26879OooOoo0)) {
            OooOoo0().f45727OooO0O0.removeAllViews();
            OooOoo0().f45731OooO0o0.setVisibility(8);
            OooOoo0().f45727OooO0O0.setVisibility(0);
            ArrayList<TagListModel.TagInfo> arrayList = this.f26879OooOoo0;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View viewInflate = View.inflate(this, oo0o0Oo.item_flow_tag_seleted, null);
                TextView textView = (TextView) viewInflate.findViewById(o0OO00O.tv_tag_flow_seleted);
                ArrayList<TagListModel.TagInfo> arrayList2 = this.f26879OooOoo0;
                Intrinsics.checkNotNull(arrayList2);
                TagListModel.TagInfo tagInfo = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(tagInfo, "get(...)");
                Integer num = this.f26881OooOooo.get(tagInfo.typeId);
                Intrinsics.checkNotNull(num);
                textView.setBackgroundResource(num.intValue());
                textView.setSelected(true);
                ArrayList<TagListModel.TagInfo> arrayList3 = this.f26879OooOoo0;
                Intrinsics.checkNotNull(arrayList3);
                TagListModel.TagInfo tagInfo2 = arrayList3.get(i);
                Intrinsics.checkNotNull(tagInfo2);
                textView.setText(tagInfo2.tagName);
                ArrayList<TagListModel.TagInfo> arrayList4 = this.f26879OooOoo0;
                Intrinsics.checkNotNull(arrayList4);
                TagListModel.TagInfo tagInfo3 = arrayList4.get(i);
                Intrinsics.checkNotNull(tagInfo3);
                viewInflate.setTag(Integer.valueOf(tagInfo3.tagId));
                viewInflate.setOnClickListener(new o000OO0O(this, 1));
                OooOoo0().f45727OooO0O0.addView(viewInflate);
            }
        } else {
            OooOoo0().f45731OooO0o0.setVisibility(0);
            OooOoo0().f45727OooO0O0.setVisibility(8);
        }
        OooOooo();
        Oooo00O();
    }

    public final void Oooo00O() {
        boolean zOooO0O0 = o0000OO0.OooO0O0(this.f26878OooOoo, this.f26879OooOoo0, OooOO0.f26891OooO0Oo);
        Lazy lazy = this.f26884Oooo00O;
        if (zOooO0O0) {
            TextView textView = (TextView) lazy.getValue();
            if (textView != null) {
                textView.setEnabled(false);
            }
            TextView textView2 = (TextView) lazy.getValue();
            if (textView2 != null) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_999999));
                return;
            }
            return;
        }
        TextView textView3 = (TextView) lazy.getValue();
        if (textView3 != null) {
            textView3.setEnabled(true);
        }
        TextView textView4 = (TextView) lazy.getValue();
        if (textView4 != null) {
            textView4.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (o0000OO0.OooO0O0(this.f26878OooOoo, this.f26879OooOoo0, OooO0o.f26890OooO0Oo)) {
            super.onBackPressed();
            return;
        }
        o000O o000o = new o000O(this);
        o000o.OooOOoo(o000000.UserInfoTag_ChangeTag_HintContent);
        o000o.OooOOOO(o000000.Save);
        o000o.OooOo0(new OooO0O0());
        o000o.OooOOO0().f39391OooO0o.setText(o000000.Discard);
        TextView tvRefuse = o000o.OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
        com.code.android.util.o000O.OooOOOO(tvRefuse);
        o000o.OooOo0O(new OooO0OO());
        o000o.OooOO0o();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo0().f45726OooO00o);
        ArrayList<TagListModel.TagInfo> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(ViewHierarchyConstants.TAG_KEY);
        if (com.code.android.util.OooOo00.OooO0O0(parcelableArrayListExtra)) {
            this.f26879OooOoo0 = parcelableArrayListExtra;
            ArrayList<TagListModel.TagInfo> arrayList = this.f26878OooOoo;
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            arrayList.addAll(parcelableArrayListExtra);
        } else {
            this.f26879OooOoo0 = new ArrayList<>();
        }
        OooOOoo(o000000.tag);
        OooOOo0(1);
        TextView textView = (TextView) this.f26884Oooo00O.getValue();
        if (textView != null) {
            textView.setTextColor(o0000.OooO00o(o0OOO0o.color_999999));
        }
        OooOoo0().f45728OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 4));
        OooOoOO().OooOoOO(true);
        OooOoOO().f13190OooOo0 = new BaseQuickAdapter.OooOO0O() { // from class: o0o00oOo.s0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0O
            public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
                int i2 = UserInfoTagActivity.f26868Oooo0O0;
                UserInfoTagActivity this$0 = this.f50590OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = gridLayoutManager.f10541OooO0o0;
                if (i < i3) {
                    return 1;
                }
                if (this$0.f26875OooOoO != i) {
                    i3 = 1;
                }
                return i3;
            }
        };
        OooOoOO().f13176OooO0o = new o000O0O0(this);
        OooOoo0().f45728OooO0OO.setAdapter(OooOoOO());
        o0O0ooO o0o0ooo = new o0O0ooO();
        o0o0ooo.f10688OooO0o = 150L;
        o0o0ooo.f10686OooO0OO = 150L;
        o0o0ooo.f10689OooO0o0 = 150L;
        o0o0ooo.f10687OooO0Oo = 150L;
        OooOoo0().f45728OooO0OO.setItemAnimator(o0o0ooo);
        if (p391o0OOooo0.o0Oo0oo.f43569OooO0OO == null) {
            synchronized (p391o0OOooo0.o0Oo0oo.class) {
                if (p391o0OOooo0.o0Oo0oo.f43569OooO0OO == null) {
                    p391o0OOooo0.o0Oo0oo.f43569OooO0OO = new p391o0OOooo0.o0Oo0oo();
                }
            }
        }
        p391o0OOooo0.o0Oo0oo o0oo0oo2 = p391o0OOooo0.o0Oo0oo.f43569OooO0OO;
        o000O0Oo o000o0oo2 = new o000O0Oo(this);
        TagListModel tagListModel = o0oo0oo2.f43570OooO00o;
        if (tagListModel != null) {
            o000o0oo2.OooO0O0(tagListModel);
            return;
        }
        o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        p391o0OOooo0.o0OOO0o o0ooo0o2 = new p391o0OOooo0.o0OOO0o(o0oo0oo2, o000o0oo2);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43394o00000, p426o0OoO0o0.OooOOOO.OooO00o(), o0ooo0o2);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!isFinishing() || this.f26882Oooo0) {
            return;
        }
        this.f26882Oooo0 = true;
        if (this.f26876OooOoO0 != -1) {
            TagListModel tagListModel = this.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f26876OooOoO0);
        }
    }
}
