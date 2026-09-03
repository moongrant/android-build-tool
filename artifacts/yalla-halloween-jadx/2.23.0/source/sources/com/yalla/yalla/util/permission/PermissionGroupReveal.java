package com.yalla.yalla.util.permission;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p594o0oo00OO.o00000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class PermissionGroupReveal {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32883OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32884OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32885OooO0oO;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/util/permission/PermissionGroupReveal$PermissionGroupType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "Mic", "Calendar", "Location", "Music", "ImageAndVideo", "ImageAndCamera", "CameraAndMic", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum PermissionGroupType {
        Mic(1),
        Calendar(2),
        Location(3),
        Music(4),
        ImageAndVideo(5),
        ImageAndCamera(6),
        CameraAndMic(7);

        private final int value;

        PermissionGroupType(int i) {
            this.value = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yalla/yalla/util/permission/PermissionGroupReveal$RevealGroupType;", "Ljava/io/Serializable;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public static final class RevealGroupType implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<String> f32886OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f32887OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f32888OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f32889OooO0oO;

        public RevealGroupType(@NotNull List permissions, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f32886OooO0Oo = permissions;
            this.f32888OooO0o0 = i;
            this.f32887OooO0o = i2;
            this.f32889OooO0oO = i3;
        }
    }

    static {
        PermissionGroupType.Mic.getClass();
        f32879OooO00o = new RevealGroupType(o00000.f56835OooO00o, oO00OOo0.permission_mic_title, oO00OOo0.permission_mic_message, oO00OOo0.permission_mic_message_setting);
        PermissionGroupType.Calendar.getClass();
        f32880OooO0O0 = new RevealGroupType(o00000.f56836OooO0O0, oO00OOo0.permission_calendar_title, oO00OOo0.permission_calendar_message, oO00OOo0.permission_calendar_message_setting);
        PermissionGroupType.Location.getClass();
        f32881OooO0OO = new RevealGroupType(o00000.f56837OooO0OO, oO00OOo0.permission_location_title, oO00OOo0.permission_location_message, oO00OOo0.permission_location_message_setting);
        PermissionGroupType.Music.getClass();
        List<String> list = o00000.f56838OooO0Oo;
        int i = Build.VERSION.SDK_INT;
        f32882OooO0Oo = new RevealGroupType(list, i >= 33 ? oO00OOo0.permission_music_title_thirteen : oO00OOo0.permission_music_title, oO00OOo0.permission_music_message, i >= 33 ? oO00OOo0.permission_music_message_setting_thirteen : oO00OOo0.permission_music_message_setting);
        PermissionGroupType.ImageAndVideo.getClass();
        f32884OooO0o0 = new RevealGroupType(o00000.f56841OooO0oO, i >= 33 ? oO00OOo0.permission_image_and_video_read_title_thirteen : oO00OOo0.permission_image_and_video_read_title, oO00OOo0.permission_image_and_video_read_message, i >= 33 ? oO00OOo0.permission_image_and_video_read_message_setting_thirteen : oO00OOo0.permission_image_and_video_read_message_setting);
        PermissionGroupType.ImageAndCamera.getClass();
        f32883OooO0o = new RevealGroupType(o00000.f56842OooO0oo, i >= 33 ? oO00OOo0.permission_image_and_camera_title_thirteen : oO00OOo0.permission_image_and_camera_title, oO00OOo0.permission_image_and_camera_message, i >= 33 ? oO00OOo0.permission_image_and_camera_message_setting_thirteen : oO00OOo0.permission_image_and_camera_message_setting);
        PermissionGroupType.CameraAndMic.getClass();
        f32885OooO0oO = new RevealGroupType(o00000.f56834OooO, i >= 33 ? oO00OOo0.permission_camera_and_mic_read_title_thirteen : oO00OOo0.permission_camera_and_mic_read_title, oO00OOo0.permission_camera_and_mic_read_message, oO00OOo0.permission_camera_and_mic_read_message_setting);
    }
}
