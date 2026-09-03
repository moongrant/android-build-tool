package com.common.support.imagepicker.preview.component.video.config;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", "", "onCollapse", "", "onExpand", "onScrubMove", "onScrubStart", "onScrubStop", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VideoControlViewUIChangeListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onCollapse(@NotNull VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        }

        public static void onExpand(@NotNull VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        }

        public static void onScrubMove(@NotNull VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        }

        public static void onScrubStart(@NotNull VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        }

        public static void onScrubStop(@NotNull VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        }
    }

    void onCollapse();

    void onExpand();

    void onScrubMove();

    void onScrubStart();

    void onScrubStop();
}
