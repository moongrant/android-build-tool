package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.opensource.svgaplayer.SVGAImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/view/UserPrettyIdView;", "Lcom/opensource/svgaplayer/SVGAImageView;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setRoomPrettyId", "", "idLevel", "setUserPrettyId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserPrettyIdView extends SVGAImageView {

    public static final class OooO00o implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            o0OO0O0.OooO oooO = new o0OO0O0.OooO(videoItem);
            UserPrettyIdView userPrettyIdView = UserPrettyIdView.this;
            userPrettyIdView.setImageDrawable(oooO);
            userPrettyIdView.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    public static final class OooO0O0 implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            o0OO0O0.OooO oooO = new o0OO0O0.OooO(videoItem);
            UserPrettyIdView userPrettyIdView = UserPrettyIdView.this;
            userPrettyIdView.setImageDrawable(oooO);
            userPrettyIdView.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    public static final class OooO0OO implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO0OO() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            o0OO0O0.OooO oooO = new o0OO0O0.OooO(videoItem);
            UserPrettyIdView userPrettyIdView = UserPrettyIdView.this;
            userPrettyIdView.setImageDrawable(oooO);
            userPrettyIdView.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx) {
        super(ctx, null, 6, 0);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void setRoomPrettyId(int idLevel) {
        if (idLevel == 0) {
            setVisibility(8);
            return;
        }
        if (idLevel == 1) {
            setVisibility(0);
            setBackgroundResource(oOo00OO0.icon_pretty_number_room);
            OooO0oO(true);
        } else {
            if (idLevel != 2) {
                return;
            }
            setVisibility(0);
            new com.opensource.svgaplayer.OooO0OO(getContext()).OooO00o("svga/room_id.svga", new OooO00o());
        }
    }

    public final void setUserPrettyId(int idLevel) {
        if (idLevel == 0) {
            setVisibility(8);
            return;
        }
        if (idLevel == 1) {
            setVisibility(0);
            setBackgroundResource(oO00OOO.ic_user_pretty_id);
            OooO0oO(true);
        } else if (idLevel == 3) {
            setVisibility(0);
            new com.opensource.svgaplayer.OooO0OO(getContext()).OooO00o("svga/user_id.svga", new OooO0O0());
        } else if (idLevel != 4) {
            setVisibility(8);
        } else {
            setVisibility(0);
            new com.opensource.svgaplayer.OooO0OO(getContext()).OooO00o("svga/user_id_4.svga", new OooO0OO());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx, @NotNull AttributeSet attrs) {
        super(ctx, attrs, 4, 0);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPrettyIdView(@NotNull Context ctx, @NotNull AttributeSet attrs, int i) {
        super(ctx, attrs, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
