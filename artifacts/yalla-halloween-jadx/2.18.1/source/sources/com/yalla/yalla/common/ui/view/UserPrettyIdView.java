package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.opensource.svgaplayer.SVGAImageView;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserPrettyIdView;", "Lcom/opensource/svgaplayer/SVGAImageView;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setRoomPrettyId", "", "idLevel", "setUserPrettyId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserPrettyIdView extends SVGAImageView {

    public static final class OooO00o implements OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            UserPrettyIdView.this.setImageDrawable(new OooO(videoItem));
            UserPrettyIdView.this.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    public static final class OooO0O0 implements OooOo00.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            UserPrettyIdView.this.setImageDrawable(new OooO(videoItem));
            UserPrettyIdView.this.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    public final void setRoomPrettyId(int idLevel) {
        if (idLevel == 0) {
            setVisibility(8);
            return;
        }
        if (idLevel == 1) {
            setVisibility(0);
            setBackgroundResource(R.drawable.icon_pretty_number_room);
            OooO0o0(true);
        } else {
            if (idLevel != 2) {
                return;
            }
            setVisibility(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            new OooOo00(context).OooO0oO("svga/room_id.svga", new OooO00o());
        }
    }

    public final void setUserPrettyId(int idLevel) {
        if (idLevel == 0) {
            setVisibility(8);
            return;
        }
        if (idLevel == 1) {
            setVisibility(0);
            setBackgroundResource(R.drawable.icon_pretty_number_user);
            OooO0o0(true);
        } else {
            if (idLevel != 3) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            new OooOo00(context).OooO0oO("svga/user_id.svga", new OooO0O0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx, @NotNull AttributeSet attrs) {
        super(ctx, attrs);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx, @NotNull AttributeSet attrs, int i) {
        super(ctx, attrs, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
