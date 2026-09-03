package com.yallatech.support.platform.share.bean;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia;", "", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "getMediaType", "()Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "mediaType", "MediaType", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IMedia {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "", "type", "I", "getType", "()I", "<init>", "(Ljava/lang/String;II)V", "UNKNOWN", ShareConstants.IMAGE_URL, "MUSIC", "WEB_PAGE", ShareConstants.VIDEO_URL, "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class MediaType {
        private final int type;
        public static final MediaType UNKNOWN = new UNKNOWN("UNKNOWN", 0);
        public static final MediaType IMAGE = new IMAGE(ShareConstants.IMAGE_URL, 1);
        public static final MediaType MUSIC = new MUSIC("MUSIC", 2);
        public static final MediaType WEB_PAGE = new WEB_PAGE("WEB_PAGE", 3);
        public static final MediaType VIDEO = new VIDEO(ShareConstants.VIDEO_URL, 4);
        private static final /* synthetic */ MediaType[] $VALUES = $values();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType$IMAGE;", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "toString", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class IMAGE extends MediaType {
            public IMAGE(String str, int i) {
                super(str, i, 0, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType$MUSIC;", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "toString", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class MUSIC extends MediaType {
            public MUSIC(String str, int i) {
                super(str, i, 1, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "1";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType$UNKNOWN;", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "toString", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class UNKNOWN extends MediaType {
            public UNKNOWN(String str, int i) {
                super(str, i, -1, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return "-1";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType$VIDEO;", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "toString", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class VIDEO extends MediaType {
            public VIDEO(String str, int i) {
                super(str, i, 3, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return FeedbackType.Recharge;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yallatech/support/platform/share/bean/IMedia$MediaType$WEB_PAGE;", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "", "toString", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class WEB_PAGE extends MediaType {
            public WEB_PAGE(String str, int i) {
                super(str, i, 2, null);
            }

            @Override // java.lang.Enum
            @NotNull
            public String toString() {
                return FeedbackType.Suggestions;
            }
        }

        private static final /* synthetic */ MediaType[] $values() {
            return new MediaType[]{UNKNOWN, IMAGE, MUSIC, WEB_PAGE, VIDEO};
        }

        public /* synthetic */ MediaType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2);
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        private MediaType(String str, int i, int i2) {
            super(str, i);
            this.type = i2;
        }
    }

    @NotNull
    MediaType getMediaType();
}
