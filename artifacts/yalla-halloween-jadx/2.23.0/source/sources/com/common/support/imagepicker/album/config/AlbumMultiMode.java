package com.common.support.imagepicker.album.config;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/common/support/imagepicker/album/config/AlbumMultiMode;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "MODE_SINGLE", "MODE_MULTI", "Companion", "album_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum AlbumMultiMode {
    UNKNOWN(-1),
    MODE_SINGLE(1),
    MODE_MULTI(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/common/support/imagepicker/album/config/AlbumMultiMode$Companion;", "", "()V", "transformValue", "Lcom/common/support/imagepicker/album/config/AlbumMultiMode;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "album_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final AlbumMultiMode transformValue(int value) {
            for (AlbumMultiMode albumMultiMode : AlbumMultiMode.values()) {
                if (albumMultiMode.getValue() == value) {
                    if (albumMultiMode == null) {
                        return AlbumMultiMode.UNKNOWN;
                    }
                    return albumMultiMode;
                }
            }
            albumMultiMode = null;
            if (albumMultiMode == null) {
                return AlbumMultiMode.UNKNOWN;
            }
            return albumMultiMode;
        }
    }

    AlbumMultiMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
