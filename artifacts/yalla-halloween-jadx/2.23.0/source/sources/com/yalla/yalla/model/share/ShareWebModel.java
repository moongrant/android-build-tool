package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.WebFrom;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/share/ShareWebModel;", "Ljava/io/Serializable;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "getId", "setId", "idx", "getIdx", "setIdx", "imagesUrl", "getImagesUrl", "setImagesUrl", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "url", "getUrl", "setUrl", "webFrom", "Lcom/yalla/yalla/model/WebFrom;", "getWebFrom", "()Lcom/yalla/yalla/model/WebFrom;", "setWebFrom", "(Lcom/yalla/yalla/model/WebFrom;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareWebModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String content;

    @Nullable
    private String id;

    @Nullable
    private String idx;

    @Nullable
    private String imagesUrl;

    @Nullable
    private String title;

    @Nullable
    private String url;

    @Nullable
    private WebFrom webFrom;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIdx() {
        return this.idx;
    }

    @Nullable
    public final String getImagesUrl() {
        return this.imagesUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final WebFrom getWebFrom() {
        return this.webFrom;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setIdx(@Nullable String str) {
        this.idx = str;
    }

    public final void setImagesUrl(@Nullable String str) {
        this.imagesUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setWebFrom(@Nullable WebFrom webFrom) {
        this.webFrom = webFrom;
    }
}
