package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.TagListModel;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133o00OO00o.o0OoOo0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p176o00OoooO.oO000Oo;
import p176o00OoooO.oO000Oo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p437o0OoOOOo.o0O0oo0o;
import p522o0o0O0o.o000O0;
import p566o0oOo00O.oO00000o;
import p566o0oOo00O.oO0000Oo;
import p649o0ooOOoo.uh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoTagActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoTagActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23538o00ooo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public TagListModel f23541Ooooo0o;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public ArrayList<TagListModel.TagInfo> f23547OoooooO;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f23552o00o0O;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23539OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(uh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f23540Ooooo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f23542OooooO0 = -1;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f23543OooooOO = -1;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f23544OooooOo = -1;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f23546Oooooo0 = -1;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final int[] f23545Oooooo = {R.drawable.shape_bg_userinfo_tag_1, R.drawable.shape_bg_userinfo_tag_2, R.drawable.shape_bg_userinfo_tag_3, R.drawable.shape_bg_userinfo_tag_4, R.drawable.shape_bg_userinfo_tag_5, R.drawable.shape_bg_userinfo_tag_6};

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final ArrayList<TagListModel.TagInfo> f23548Ooooooo = new ArrayList<>();

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final SparseArray<TagListModel.TagInfo> f23553o0OoOo0 = new SparseArray<>();

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final SparseArray<Integer> f23554ooOO = new SparseArray<>();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final int f23549o00O0O = 6;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public final Lazy f23550o00Oo0 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f23551o00Ooo = true;

    public static final class OooO extends Lambda implements Function1<TagListModel.TagInfo, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f23555Oooo0o = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(TagListModel.TagInfo tagInfo) {
            TagListModel.TagInfo data = tagInfo;
            Intrinsics.checkNotNullParameter(data, "data");
            return Integer.valueOf(data.tagId);
        }
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooOOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            return new OooOOO0(UserInfoTagActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoTagActivity.OooOooo(UserInfoTagActivity.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoTagActivity.this.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<TextView> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            UserInfoTagActivity userInfoTagActivity = UserInfoTagActivity.this;
            HeaderLayout headerLayout = userInfoTagActivity.f11463OoooO;
            if (headerLayout != null) {
                return headerLayout.OooOoo0(R.string.Save, new OooOOO(userInfoTagActivity));
            }
            return null;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<TagListModel.TagInfo, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f23560Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(TagListModel.TagInfo tagInfo) {
            TagListModel.TagInfo data = tagInfo;
            Intrinsics.checkNotNullParameter(data, "data");
            return Integer.valueOf(data.tagId);
        }
    }

    public static final boolean OooOoo(UserInfoTagActivity userInfoTagActivity, int i) {
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f23547OoooooO;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.tagId == i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooOooO(UserInfoTagActivity userInfoTagActivity, TagListModel.TagType tagType) {
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f23547OoooooO;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.typeId == tagType.tagId) {
                return true;
            }
        }
        return false;
    }

    public static final void OooOooo(UserInfoTagActivity userInfoTagActivity) {
        Objects.requireNonNull(userInfoTagActivity);
        HashMap map = new HashMap();
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<TagListModel.TagInfo> arrayList = userInfoTagActivity.f23547OoooooO;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            for (TagListModel.TagInfo tagInfo : arrayList) {
                Intrinsics.checkNotNull(tagInfo);
                stringBuffer.append(tagInfo.tagId);
                stringBuffer.append(",");
            }
        }
        if (stringBuffer.length() > 1) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        } else {
            stringBuffer.append("-1");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tagString.toString()");
        map.put("tagIds", string);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32209OooO0OO.OooO0O0(userInfoTagActivity, map, new oO0000Oo(userInfoTagActivity, userInfoTagActivity));
    }

    public final TextView Oooo0() {
        return (TextView) this.f23550o00Oo0.getValue();
    }

    public final p188o00o00o0.OooO0OO<TagListModel.TagType> Oooo000() {
        return (p188o00o00o0.OooO0OO) this.f23540Ooooo00.getValue();
    }

    public final uh Oooo00O() {
        return (uh) this.f23539OoooOoo.getValue();
    }

    public final TagListModel.TagInfo Oooo00o(int i) {
        ArrayList<TagListModel.TagInfo> arrayList = this.f23547OoooooO;
        Intrinsics.checkNotNull(arrayList);
        for (TagListModel.TagInfo tagInfo : arrayList) {
            Intrinsics.checkNotNull(tagInfo);
            if (tagInfo.tagId == i) {
                return tagInfo;
            }
        }
        return null;
    }

    public final void Oooo0O0(int i) {
        int size;
        if (this.f23544OooooOo == i) {
            return;
        }
        if (this.f23542OooooO0 == i) {
            this.f23543OooooOO = -1;
            this.f23546Oooooo0 = -1;
            Oooo000().notifyItemChanged(this.f23542OooooO0);
            this.f23542OooooO0 = -1;
            TagListModel tagListModel = this.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f23544OooooOo);
            Oooo000().notifyItemRemoved(this.f23544OooooOo);
            this.f23544OooooOo = -1;
            Oooo0o();
            return;
        }
        this.f23543OooooOO = i;
        Oooo000().notifyItemChanged(this.f23542OooooO0);
        Oooo000().notifyItemChanged(this.f23543OooooOO);
        int i2 = this.f23544OooooOo;
        if (i2 != -1 && i > i2) {
            i--;
        }
        if (i2 == -1) {
            TagListModel tagListModel2 = this.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel2);
            size = tagListModel2.data.size();
        } else {
            TagListModel tagListModel3 = this.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel3);
            size = tagListModel3.data.size() - 1;
        }
        int i3 = (i + 4) - (i % 4);
        if (i3 <= size) {
            size = i3;
        }
        int i4 = this.f23544OooooOo;
        if (i4 == -1) {
            this.f23546Oooooo0 = size;
            TagListModel tagListModel4 = this.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel4);
            tagListModel4.data.add(size, new TagListModel.TagType());
            Oooo000().notifyItemInserted(size);
            Oooo0o();
            return;
        }
        if (size == i4) {
            this.f23546Oooooo0 = size;
            Oooo000().notifyItemChanged(size);
            Oooo0o();
            return;
        }
        TagListModel tagListModel5 = this.f23541Ooooo0o;
        Intrinsics.checkNotNull(tagListModel5);
        tagListModel5.data.remove(this.f23544OooooOo);
        Oooo000().notifyItemRemoved(this.f23544OooooOo);
        if (size > this.f23544OooooOo) {
            this.f23543OooooOO--;
        }
        this.f23546Oooooo0 = size;
        TagListModel tagListModel6 = this.f23541Ooooo0o;
        Intrinsics.checkNotNull(tagListModel6);
        tagListModel6.data.add(size, new TagListModel.TagType());
        Oooo000().notifyItemInserted(size);
        Oooo0o();
    }

    public final void Oooo0OO() {
        StringBuilder sb = new StringBuilder();
        ArrayList<TagListModel.TagInfo> arrayList = this.f23547OoooooO;
        Intrinsics.checkNotNull(arrayList);
        sb.append(arrayList.size());
        sb.append("/6");
        String string = sb.toString();
        Oooo00O().f50750OooO0o.setText(o000O0O0.OooO0OO(R.string.Tag_edit_selected_tag) + ' ' + string);
    }

    public final void Oooo0o() {
        if (o000O0.OooO0O0(this.f23548Ooooooo, this.f23547OoooooO, OooOO0O.f23560Oooo0o)) {
            TextView textViewOooo0 = Oooo0();
            if (textViewOooo0 != null) {
                textViewOooo0.setEnabled(false);
            }
            TextView textViewOooo1 = Oooo0();
            if (textViewOooo1 != null) {
                textViewOooo1.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
                return;
            }
            return;
        }
        TextView textViewOooo2 = Oooo0();
        if (textViewOooo2 != null) {
            textViewOooo2.setEnabled(true);
        }
        TextView textViewOooo3 = Oooo0();
        if (textViewOooo3 != null) {
            textViewOooo3.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        }
    }

    public final void Oooo0o0() {
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f23547OoooooO)) {
            Oooo00O().f50747OooO0O0.removeAllViews();
            Oooo00O().f50751OooO0o0.setVisibility(8);
            Oooo00O().f50747OooO0O0.setVisibility(0);
            ArrayList<TagListModel.TagInfo> arrayList = this.f23547OoooooO;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View viewInflate = View.inflate(this, R.layout.item_flow_tag_seleted, null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_tag_flow_seleted);
                ArrayList<TagListModel.TagInfo> arrayList2 = this.f23547OoooooO;
                Intrinsics.checkNotNull(arrayList2);
                TagListModel.TagInfo tagInfo = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(tagInfo, "selectedTags!![i]");
                Integer backgroundResource = this.f23554ooOO.get(tagInfo.typeId);
                Intrinsics.checkNotNullExpressionValue(backgroundResource, "backgroundResource");
                textView.setBackgroundResource(backgroundResource.intValue());
                textView.setSelected(true);
                ArrayList<TagListModel.TagInfo> arrayList3 = this.f23547OoooooO;
                Intrinsics.checkNotNull(arrayList3);
                TagListModel.TagInfo tagInfo2 = arrayList3.get(i);
                Intrinsics.checkNotNull(tagInfo2);
                textView.setText(tagInfo2.tagName);
                ArrayList<TagListModel.TagInfo> arrayList4 = this.f23547OoooooO;
                Intrinsics.checkNotNull(arrayList4);
                TagListModel.TagInfo tagInfo3 = arrayList4.get(i);
                Intrinsics.checkNotNull(tagInfo3);
                viewInflate.setTag(Integer.valueOf(tagInfo3.tagId));
                viewInflate.setOnClickListener(new o0O0oo0o(this, 2));
                Oooo00O().f50747OooO0O0.addView(viewInflate);
            }
        } else {
            Oooo00O().f50751OooO0o0.setVisibility(0);
            Oooo00O().f50747OooO0O0.setVisibility(8);
        }
        Oooo0OO();
        Oooo0o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (o000O0.OooO0O0(this.f23548Ooooooo, this.f23547OoooooO, OooO.f23555Oooo0o)) {
            super.onBackPressed();
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0(R.string.UserInfoTag_ChangeTag_HintContent);
        oo0ooo0.OooOOOo(R.string.Save);
        oo0ooo0.OooOo0o(new OooO0OO());
        oo0ooo0.OooOOO().f34399OooO0o.setText(R.string.Discard);
        TextView textView = oo0ooo0.OooOOO().f34399OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        oOO00O.OooO(textView);
        oo0ooo0.OooOo(new OooO0o());
        oo0ooo0.OooOOO0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo00O().f50746OooO00o);
        ArrayList<TagListModel.TagInfo> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(ViewHierarchyConstants.TAG_KEY);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(parcelableArrayListExtra)) {
            this.f23547OoooooO = parcelableArrayListExtra;
            ArrayList<TagListModel.TagInfo> arrayList = this.f23548Ooooooo;
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            arrayList.addAll(parcelableArrayListExtra);
        } else {
            this.f23547OoooooO = new ArrayList<>();
        }
        OooOo(R.string.tag);
        OooOo0O(1);
        TextView textViewOooo0 = Oooo0();
        if (textViewOooo0 != null) {
            textViewOooo0.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
        }
        Oooo00O().f50748OooO0OO.setLayoutManager(new FixGridLayoutManager(this, 4));
        Oooo000().hindEmptyView(true);
        Oooo000().setSpanSizeLookup(new oO000Oo0(this));
        Oooo000().setOnItemClickListener(new oO000Oo(this, 3));
        Oooo00O().f50748OooO0OO.setAdapter(Oooo000());
        o0OoOo0 o0oooo1 = new o0OoOo0();
        o0oooo1.f9012OooO0o = 150L;
        o0oooo1.f9010OooO0OO = 150L;
        o0oooo1.f9013OooO0o0 = 150L;
        o0oooo1.f9011OooO0Oo = 150L;
        Oooo00O().f50748OooO0OO.setItemAnimator(o0oooo1);
        oo0O.OooO0O0 oooO0O0OooO00o = oo0O.OooO0O0.OooO00o();
        oO00000o oo00000o = new oO00000o(this);
        TagListModel tagListModel = oooO0O0OooO00o.f53323OooO00o;
        if (tagListModel != null) {
            oo00000o.OooO0OO(tagListModel);
        } else {
            oooO0O0OooO00o.OooO0O0(oo00000o);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!isFinishing() || this.f23552o00o0O) {
            return;
        }
        this.f23552o00o0O = true;
        if (this.f23544OooooOo != -1) {
            TagListModel tagListModel = this.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel);
            tagListModel.data.remove(this.f23544OooooOo);
        }
    }
}
