package com.yalla.yalla.util.permission;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p600o0oo00o0.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class PermissionGroupReveal {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final RevealGroupType f32341OooO0oO;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v1 com.yalla.yalla.util.permission.PermissionGroupReveal$PermissionGroupType[], still in use, count: 1, list:
      (r14v1 com.yalla.yalla.util.permission.PermissionGroupReveal$PermissionGroupType[]) from 0x0059: INVOKE (r14v1 com.yalla.yalla.util.permission.PermissionGroupReveal$PermissionGroupType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/util/permission/PermissionGroupReveal$PermissionGroupType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "Mic", "Calendar", "Location", "Music", "ImageAndVideo", "ImageAndCamera", "CameraAndMic", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class PermissionGroupType {
        Mic(1),
        Calendar(2),
        Location(3),
        Music(4),
        ImageAndVideo(5),
        ImageAndCamera(6),
        CameraAndMic(7);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(permissionGroupTypeArr);
        }

        public PermissionGroupType(int i) {
            super(str, i);
            this.value = i;
        }

        public static PermissionGroupType valueOf(String str) {
            return (PermissionGroupType) Enum.valueOf(PermissionGroupType.class, str);
        }

        public static PermissionGroupType[] values() {
            return (PermissionGroupType[]) $VALUES.clone();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yalla/yalla/util/permission/PermissionGroupReveal$RevealGroupType;", "Ljava/io/Serializable;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class RevealGroupType implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<String> f32342OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f32343OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f32344OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f32345OooO0oO;

        public RevealGroupType(@NotNull List permissions, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f32342OooO0Oo = permissions;
            this.f32344OooO0o0 = i;
            this.f32343OooO0o = i2;
            this.f32345OooO0oO = i3;
        }
    }

    static {
        PermissionGroupType.Mic.getClass();
        f32335OooO00o = new RevealGroupType(o00000O0.f57368OooO00o, o000000.permission_mic_title, o000000.permission_mic_message, o000000.permission_mic_message_setting);
        PermissionGroupType.Calendar.getClass();
        f32336OooO0O0 = new RevealGroupType(o00000O0.f57369OooO0O0, o000000.permission_calendar_title, o000000.permission_calendar_message, o000000.permission_calendar_message_setting);
        PermissionGroupType.Location.getClass();
        f32337OooO0OO = new RevealGroupType(o00000O0.f57370OooO0OO, o000000.permission_location_title, o000000.permission_location_message, o000000.permission_location_message_setting);
        PermissionGroupType.Music.getClass();
        List<String> list = o00000O0.f57371OooO0Oo;
        int i = Build.VERSION.SDK_INT;
        f32338OooO0Oo = new RevealGroupType(list, i >= 33 ? o000000.permission_music_title_thirteen : o000000.permission_music_title, o000000.permission_music_message, i >= 33 ? o000000.permission_music_message_setting_thirteen : o000000.permission_music_message_setting);
        PermissionGroupType.ImageAndVideo.getClass();
        f32340OooO0o0 = new RevealGroupType(o00000O0.f57374OooO0oO, i >= 33 ? o000000.permission_image_and_video_read_title_thirteen : o000000.permission_image_and_video_read_title, o000000.permission_image_and_video_read_message, i >= 33 ? o000000.permission_image_and_video_read_message_setting_thirteen : o000000.permission_image_and_video_read_message_setting);
        PermissionGroupType.ImageAndCamera.getClass();
        f32339OooO0o = new RevealGroupType(o00000O0.f57375OooO0oo, i >= 33 ? o000000.permission_image_and_camera_title_thirteen : o000000.permission_image_and_camera_title, o000000.permission_image_and_camera_message, i >= 33 ? o000000.permission_image_and_camera_message_setting_thirteen : o000000.permission_image_and_camera_message_setting);
        PermissionGroupType.CameraAndMic.getClass();
        f32341OooO0oO = new RevealGroupType(o00000O0.f57367OooO, i >= 33 ? o000000.permission_camera_and_mic_read_title_thirteen : o000000.permission_camera_and_mic_read_title, o000000.permission_camera_and_mic_read_message, o000000.permission_camera_and_mic_read_message_setting);
    }
}
