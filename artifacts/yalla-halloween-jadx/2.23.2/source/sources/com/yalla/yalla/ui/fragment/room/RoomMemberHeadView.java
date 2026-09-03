package com.yalla.yalla.ui.fragment.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.view.DotView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.e1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u0011R\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\u001e¨\u00063"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomMemberHeadView;", "Landroid/widget/FrameLayout;", "Lo0Oo0OOO/e1;", "OooO0Oo", "Lo0Oo0OOO/e1;", "getBinding", "()Lo0Oo0OOO/e1;", "binding", "Landroid/widget/EditText;", "OooO0o0", "Lkotlin/Lazy;", "getEditSearch", "()Landroid/widget/EditText;", "editSearch", "Landroid/widget/ImageView;", "OooO0o", "getIvDelete", "()Landroid/widget/ImageView;", "ivDelete", "Lcom/yalla/yalla/ui/view/DotView;", "OooO0oO", "getConvenePosition", "()Lcom/yalla/yalla/ui/view/DotView;", "convenePosition", "OooO0oo", "getIvDoubt", "ivDoubt", "Landroid/widget/TextView;", "OooO", "getMemberCountTv", "()Landroid/widget/TextView;", "memberCountTv", "OooOO0", "getEditCancelTv", "editCancelTv", "Landroid/widget/LinearLayout;", "OooOO0O", "getLlSearch", "()Landroid/widget/LinearLayout;", "llSearch", "OooOO0o", "getTextSearch", "textSearch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomMemberHeadView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy memberCountTv;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e1 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ivDelete;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy editSearch;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy convenePosition;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ivDoubt;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy editCancelTv;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy llSearch;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy textSearch;

    public static final class OooO extends Lambda implements Function0<ImageView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView doubt = RoomMemberHeadView.this.getBinding().f43815OooO0o0;
            Intrinsics.checkNotNullExpressionValue(doubt, "doubt");
            return doubt;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<DotView> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DotView invoke() {
            DotView convenePosition = RoomMemberHeadView.this.getBinding().f43811OooO0O0;
            Intrinsics.checkNotNullExpressionValue(convenePosition, "convenePosition");
            return convenePosition;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TextView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView tvCancel = RoomMemberHeadView.this.getBinding().f43814OooO0o.f44609OooO0o0;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            return tvCancel;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EditText> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditText invoke() {
            EditText searchEdit = RoomMemberHeadView.this.getBinding().f43814OooO0o.f44607OooO0OO;
            Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
            return searchEdit;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ImageView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView delete = RoomMemberHeadView.this.getBinding().f43813OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(delete, "delete");
            return delete;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<LinearLayout> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout layoutSearch = RoomMemberHeadView.this.getBinding().f43814OooO0o.f44606OooO0O0;
            Intrinsics.checkNotNullExpressionValue(layoutSearch, "layoutSearch");
            return layoutSearch;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<TextView> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView count = RoomMemberHeadView.this.getBinding().f43812OooO0OO;
            Intrinsics.checkNotNullExpressionValue(count, "count");
            return count;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<TextView> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            TextView searchText = RoomMemberHeadView.this.getBinding().f43814OooO0o.f44608OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(searchText, "searchText");
            return searchText;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final e1 getBinding() {
        return this.binding;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomMemberHeadView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        e1 e1VarInflate = e1.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(e1VarInflate, "inflate(...)");
        this.binding = e1VarInflate;
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
