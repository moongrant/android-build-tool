package com.app.base.fragment.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.ui.view.DotView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.ah;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0019\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0018R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/app/base/fragment/room/RoomMemberHeadView;", "Landroid/widget/FrameLayout;", "Landroid/widget/EditText;", "Oooo0oO", "Lkotlin/Lazy;", "getEditSearch", "()Landroid/widget/EditText;", "editSearch", "Landroid/widget/ImageView;", "Oooo0oo", "getIvDelete", "()Landroid/widget/ImageView;", "ivDelete", "Lcom/yalla/yalla/common/ui/view/DotView;", "Oooo", "getConvenePosition", "()Lcom/yalla/yalla/common/ui/view/DotView;", "convenePosition", "OoooO00", "getIvDoubt", "ivDoubt", "Landroid/widget/TextView;", "OoooO0", "getMemberCountTv", "()Landroid/widget/TextView;", "memberCountTv", "OoooO0O", "getEditCancelTv", "editCancelTv", "Landroid/widget/LinearLayout;", "OoooO", "getLlSearch", "()Landroid/widget/LinearLayout;", "llSearch", "OoooOO0", "getTextSearch", "textSearch", "Lo0ooOOoo/ah;", "binding", "Lo0ooOOoo/ah;", "getBinding", "()Lo0ooOOoo/ah;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMemberHeadView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy convenePosition;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ah f11692Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy editSearch;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ivDelete;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy llSearch;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy memberCountTv;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ivDoubt;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy editCancelTv;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy textSearch;

    public static final class OooO extends Lambda implements Function0<ImageView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = RoomMemberHeadView.this.getF11692Oooo0o().f48964OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.doubt");
            return imageView;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<DotView> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DotView invoke() {
            DotView dotView = RoomMemberHeadView.this.getF11692Oooo0o().f48960OooO0O0;
            Intrinsics.checkNotNullExpressionValue(dotView, "binding.convenePosition");
            return dotView;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TextView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView textView = RoomMemberHeadView.this.getF11692Oooo0o().f48963OooO0o.f50640OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.search.tvCancel");
            return textView;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EditText> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditText invoke() {
            EditText editText = RoomMemberHeadView.this.getF11692Oooo0o().f48963OooO0o.f50638OooO0OO;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search.searchEdit");
            return editText;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ImageView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = RoomMemberHeadView.this.getF11692Oooo0o().f48962OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.delete");
            return imageView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<LinearLayout> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout linearLayout = RoomMemberHeadView.this.getF11692Oooo0o().f48963OooO0o.f50637OooO0O0;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.search.layoutSearch");
            return linearLayout;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<TextView> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView textView = RoomMemberHeadView.this.getF11692Oooo0o().f48961OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.count");
            return textView;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<TextView> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView textView = RoomMemberHeadView.this.getF11692Oooo0o().f48963OooO0o.f50639OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.search.searchText");
            return textView;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomMemberHeadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final ah getF11692Oooo0o() {
        return this.f11692Oooo0o;
    }

    @NotNull
    public final DotView getConvenePosition() {
        return (DotView) this.convenePosition.getValue();
    }

    @NotNull
    public final TextView getEditCancelTv() {
        return (TextView) this.editCancelTv.getValue();
    }

    @NotNull
    public final EditText getEditSearch() {
        return (EditText) this.editSearch.getValue();
    }

    @NotNull
    public final ImageView getIvDelete() {
        return (ImageView) this.ivDelete.getValue();
    }

    @NotNull
    public final ImageView getIvDoubt() {
        return (ImageView) this.ivDoubt.getValue();
    }

    @NotNull
    public final LinearLayout getLlSearch() {
        return (LinearLayout) this.llSearch.getValue();
    }

    @NotNull
    public final TextView getMemberCountTv() {
        return (TextView) this.memberCountTv.getValue();
    }

    @NotNull
    public final TextView getTextSearch() {
        return (TextView) this.textSearch.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ah ahVarInflate = ah.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ahVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f11692Oooo0o = ahVarInflate;
        this.editSearch = LazyKt.lazy(new OooO0OO());
        this.ivDelete = LazyKt.lazy(new OooO0o());
        this.convenePosition = LazyKt.lazy(new OooO00o());
        this.ivDoubt = LazyKt.lazy(new OooO());
        this.memberCountTv = LazyKt.lazy(new OooOO0O());
        this.editCancelTv = LazyKt.lazy(new OooO0O0());
        this.llSearch = LazyKt.lazy(new OooOO0());
        this.textSearch = LazyKt.lazy(new OooOOO0());
    }
}
