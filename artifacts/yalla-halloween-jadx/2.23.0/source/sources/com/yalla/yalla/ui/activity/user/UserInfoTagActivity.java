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
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.adapter.o00O0000;
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
import p042OooooO0.o00OOO0;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O000;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p385o0OOooOO.o00O00;
import p385o0OOooOO.o00O000o;
import p417o0OoO0.oo000o;
import p474o0o00.o00oOoo;
import p496o0o00o.oO0O0;
import p496o0o00o.oO0O00;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.ka;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoTagActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserInfoTagActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoTagActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoTagActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,454:1\n22#2,2:455\n75#3,13:457\n*S KotlinDebug\n*F\n+ 1 UserInfoTagActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoTagActivity\n*L\n37#1:455,2\n38#1:457,13\n*E\n"})
public final class UserInfoTagActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f27333Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TagListModel f27338OooOo0O;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ArrayList<TagListModel.TagInfo> f27344OooOoo0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f27347Oooo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27334OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ka.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27337OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoTagActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f27359OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27359OooO0Oo;
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
    public final Lazy f27336OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f27339OooOo0o = -1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f27335OooOo = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f27341OooOoO0 = -1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f27340OooOoO = -1;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final int[] f27342OooOoOO = {oOo00OO0.shape_bg_userinfo_tag_1, oOo00OO0.shape_bg_userinfo_tag_2, oOo00OO0.shape_bg_userinfo_tag_3, oOo00OO0.shape_bg_userinfo_tag_4, oOo00OO0.shape_bg_userinfo_tag_5, oOo00OO0.shape_bg_userinfo_tag_6};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ArrayList<TagListModel.TagInfo> f27343OooOoo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final SparseArray<TagListModel.TagInfo> f27345OooOooO = new SparseArray<>();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final SparseArray<Integer> f27346OooOooo = new SparseArray<>();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f27348Oooo000 = 6;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f27349Oooo00O = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27350Oooo00o = true;

    public static final class OooO extends Lambda implements Function0<TextView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            UserInfoTagActivity userInfoTagActivity = UserInfoTagActivity.this;
            HeaderLayout headerLayout = userInfoTagActivity.f22755OooOO0;
            if (headerLayout != null) {
                return headerLayout.OooOoO0(oO00OOo0.Save, new o0OoOo0(userInfoTagActivity));
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
            return new o000oOoO(UserInfoTagActivity.this, oO00OO0O.item_useirnfo_edit_tags);
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
        public static final OooO0o f27355OooO0Oo = new OooO0o();

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
        public static final OooOO0 f27356OooO0Oo = new OooOO0();

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
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f27344OooOoo0;
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
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f27344OooOoo0;
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
        o000O000.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) userInfoTagActivity.f27337OooOo00.getValue(), null, null, null, stringBuffer.toString(), null, null, null, null, 247, null), userInfoTagActivity, false, null, null, new oO0O0(userInfoTagActivity), 14);
    }

    public static final boolean OooOoO0(UserInfoTagActivity userInfoTagActivity, TagListModel.TagType tagType) {
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f27344OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.typeId == tagType.tagId) {
                return true;
            }
        }
        return false;
    }

    public final o000O<TagListModel.TagType> OooOoOO() {
        return (o000O) this.f27336OooOo0.getValue();
    }

    public final TagListModel.TagInfo OooOoo(int i) {
        ArrayList<TagListModel.TagInfo> arrayList = this.f27344OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.tagId == i) {
                return tagInfo;
            }
        }
        return null;
    }

    public final ka OooOoo0() {
        return (ka) this.f27334OooOOoo.getValue();
    }

    public final void OooOooO(int i) {
        int size;
        if (this.f27341OooOoO0 == i) {
            return;
        }
        if (this.f27339OooOo0o == i) {
            this.f27335OooOo = -1;
            this.f27340OooOoO = -1;
            OooOoOO().notifyItemChanged(this.f27339OooOo0o);
            this.f27339OooOo0o = -1;
            TagListModel tagListModel = this.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f27341OooOoO0);
            OooOoOO().notifyItemRemoved(this.f27341OooOoO0);
            this.f27341OooOoO0 = -1;
            Oooo00O();
            return;
        }
        this.f27335OooOo = i;
        OooOoOO().notifyItemChanged(this.f27339OooOo0o);
        OooOoOO().notifyItemChanged(this.f27335OooOo);
        int i2 = this.f27341OooOoO0;
        if (i2 != -1 && i > i2) {
            i--;
        }
        if (i2 == -1) {
            TagListModel tagListModel2 = this.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel2);
            size = tagListModel2.data.size();
        } else {
            TagListModel tagListModel3 = this.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel3);
            size = tagListModel3.data.size() - 1;
        }
        int i3 = (i + 4) - (i % 4);
        if (i3 <= size) {
            size = i3;
        }
        int i4 = this.f27341OooOoO0;
        if (i4 == -1) {
            this.f27340OooOoO = size;
            TagListModel tagListModel4 = this.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel4);
            tagListModel4.data.add(size, new TagListModel.TagType());
            OooOoOO().notifyItemInserted(size);
            Oooo00O();
            return;
        }
        if (size == i4) {
            this.f27340OooOoO = size;
            OooOoOO().notifyItemChanged(size);
            Oooo00O();
            return;
        }
        TagListModel tagListModel5 = this.f27338OooOo0O;
        Intrinsics.checkNotNull(tagListModel5);
        tagListModel5.data.remove(this.f27341OooOoO0);
        OooOoOO().notifyItemRemoved(this.f27341OooOoO0);
        if (size > this.f27341OooOoO0) {
            this.f27335OooOo--;
        }
        this.f27340OooOoO = size;
        TagListModel tagListModel6 = this.f27338OooOo0O;
        Intrinsics.checkNotNull(tagListModel6);
        tagListModel6.data.add(size, new TagListModel.TagType());
        OooOoOO().notifyItemInserted(size);
        Oooo00O();
    }

    public final void OooOooo() {
        ArrayList<TagListModel.TagInfo> arrayList = this.f27344OooOoo0;
        Intrinsics.checkNotNull(arrayList);
        String str = arrayList.size() + "/6";
        OooOoo0().f58309OooO0o.setText(o0000.OooO0OO(oO00OOo0.Tag_edit_selected_tag) + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
    }

    public final void Oooo000() {
        if (com.code.android.util.OooOo00.OooO0O0(this.f27344OooOoo0)) {
            OooOoo0().f58306OooO0O0.removeAllViews();
            OooOoo0().f58310OooO0o0.setVisibility(8);
            OooOoo0().f58306OooO0O0.setVisibility(0);
            ArrayList<TagListModel.TagInfo> arrayList = this.f27344OooOoo0;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View viewInflate = View.inflate(this, oO00OO0O.item_flow_tag_seleted, null);
                TextView textView = (TextView) viewInflate.findViewById(oO00O0oO.tv_tag_flow_seleted);
                ArrayList<TagListModel.TagInfo> arrayList2 = this.f27344OooOoo0;
                Intrinsics.checkNotNull(arrayList2);
                TagListModel.TagInfo tagInfo = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(tagInfo, "selectedTags!![i]");
                Integer backgroundResource = this.f27346OooOooo.get(tagInfo.typeId);
                Intrinsics.checkNotNullExpressionValue(backgroundResource, "backgroundResource");
                textView.setBackgroundResource(backgroundResource.intValue());
                textView.setSelected(true);
                ArrayList<TagListModel.TagInfo> arrayList3 = this.f27344OooOoo0;
                Intrinsics.checkNotNull(arrayList3);
                TagListModel.TagInfo tagInfo2 = arrayList3.get(i);
                Intrinsics.checkNotNull(tagInfo2);
                textView.setText(tagInfo2.tagName);
                ArrayList<TagListModel.TagInfo> arrayList4 = this.f27344OooOoo0;
                Intrinsics.checkNotNull(arrayList4);
                TagListModel.TagInfo tagInfo3 = arrayList4.get(i);
                Intrinsics.checkNotNull(tagInfo3);
                viewInflate.setTag(Integer.valueOf(tagInfo3.tagId));
                viewInflate.setOnClickListener(new o00oOoo(this, 1));
                OooOoo0().f58306OooO0O0.addView(viewInflate);
            }
        } else {
            OooOoo0().f58310OooO0o0.setVisibility(0);
            OooOoo0().f58306OooO0O0.setVisibility(8);
        }
        OooOooo();
        Oooo00O();
    }

    public final void Oooo00O() {
        boolean zOooO0O0 = oo000o.OooO0O0(this.f27343OooOoo, this.f27344OooOoo0, OooOO0.f27356OooO0Oo);
        Lazy lazy = this.f27349Oooo00O;
        if (zOooO0O0) {
            TextView textView = (TextView) lazy.getValue();
            if (textView != null) {
                textView.setEnabled(false);
            }
            TextView textView2 = (TextView) lazy.getValue();
            if (textView2 != null) {
                textView2.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
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
            textView4.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (oo000o.OooO0O0(this.f27343OooOoo, this.f27344OooOoo0, OooO0o.f27355OooO0Oo)) {
            super.onBackPressed();
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        o0oo00o2.OooOOoo(oO00OOo0.UserInfoTag_ChangeTag_HintContent);
        o0oo00o2.OooOOOO(oO00OOo0.Save);
        o0oo00o2.OooOo0(new OooO0O0());
        o0oo00o2.OooOOO0().f38475OooO0o.setText(oO00OOo0.Discard);
        TextView textView = o0oo00o2.OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        o000OO00.OooOOOO(textView);
        o0oo00o2.OooOo0O(new OooO0OO());
        o0oo00o2.OooOO0o();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo0().f58305OooO00o);
        ArrayList<TagListModel.TagInfo> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(ViewHierarchyConstants.TAG_KEY);
        if (com.code.android.util.OooOo00.OooO0O0(parcelableArrayListExtra)) {
            this.f27344OooOoo0 = parcelableArrayListExtra;
            ArrayList<TagListModel.TagInfo> arrayList = this.f27343OooOoo;
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            arrayList.addAll(parcelableArrayListExtra);
        } else {
            this.f27344OooOoo0 = new ArrayList<>();
        }
        OooOOoo(oO00OOo0.tag);
        OooOOo0(1);
        TextView textView = (TextView) this.f27349Oooo00O.getValue();
        if (textView != null) {
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
        }
        OooOoo0().f58307OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 4));
        OooOoOO().OooOoOO(true);
        OooOoOO().f10112OooOo0 = new BaseQuickAdapter.OooOO0O() { // from class: o0o00o.oO0O00O
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0O
            public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
                int i2 = UserInfoTagActivity.f27333Oooo0O0;
                UserInfoTagActivity this$0 = this.f49156OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = gridLayoutManager.f7447OooO0o0;
                if (i < i3) {
                    return 1;
                }
                if (this$0.f27340OooOoO != i) {
                    i3 = 1;
                }
                return i3;
            }
        };
        OooOoOO().f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00o.oO0O00o0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = UserInfoTagActivity.f27333Oooo0O0;
                UserInfoTagActivity this$0 = this.f49157OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f27350Oooo00o) {
                    this$0.f27350Oooo00o = false;
                    view.postDelayed(new o00OOO0(this$0, 1), 500L);
                    this$0.OooOooO(i);
                }
            }
        };
        OooOoo0().f58307OooO0OO.setAdapter(OooOoOO());
        o00O0000 o00o0001 = new o00O0000();
        o00o0001.f7629OooO0o = 150L;
        o00o0001.f7627OooO0OO = 150L;
        o00o0001.f7630OooO0o0 = 150L;
        o00o0001.f7628OooO0Oo = 150L;
        OooOoo0().f58307OooO0OO.setItemAnimator(o00o0001);
        if (o00O00.f44338OooO0OO == null) {
            synchronized (o00O00.class) {
                if (o00O00.f44338OooO0OO == null) {
                    o00O00.f44338OooO0OO = new o00O00();
                }
            }
        }
        o00O00 o00o01 = o00O00.f44338OooO0OO;
        oO0O00 oo0o00 = new oO0O00(this);
        TagListModel tagListModel = o00o01.f44339OooO00o;
        if (tagListModel != null) {
            oo0o00.OooO00o(tagListModel);
            return;
        }
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        o00O000o o00o000o2 = new o00O000o(o00o01, oo0o00);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44135o00000, oO00o000.OooO00o(), o00o000o2);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!isFinishing() || this.f27347Oooo0) {
            return;
        }
        this.f27347Oooo0 = true;
        if (this.f27341OooOoO0 != -1) {
            TagListModel tagListModel = this.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f27341OooOoO0);
        }
    }
}
