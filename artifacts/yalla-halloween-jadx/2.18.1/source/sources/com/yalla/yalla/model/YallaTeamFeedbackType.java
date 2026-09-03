package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamFeedbackType;", "", "typeName", "", "typeId", "", "(Ljava/lang/String;I)V", "getTypeId", "()I", "setTypeId", "(I)V", "getTypeName", "()Ljava/lang/String;", "setTypeName", "(Ljava/lang/String;)V", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YallaTeamFeedbackType {
    private int typeId;

    @NotNull
    private String typeName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static int AppProblems = 1;
    private static int Suggestions = 2;
    private static int Recharge = 3;
    private static int Others = 5;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamFeedbackType$Companion;", "", "()V", "AppProblems", "", "getAppProblems", "()I", "setAppProblems", "(I)V", "Others", "getOthers", "setOthers", "Recharge", "getRecharge", "setRecharge", "Suggestions", "getSuggestions", "setSuggestions", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAppProblems() {
            return YallaTeamFeedbackType.AppProblems;
        }

        public final int getOthers() {
            return YallaTeamFeedbackType.Others;
        }

        public final int getRecharge() {
            return YallaTeamFeedbackType.Recharge;
        }

        public final int getSuggestions() {
            return YallaTeamFeedbackType.Suggestions;
        }

        public final void setAppProblems(int i) {
            YallaTeamFeedbackType.AppProblems = i;
        }

        public final void setOthers(int i) {
            YallaTeamFeedbackType.Others = i;
        }

        public final void setRecharge(int i) {
            YallaTeamFeedbackType.Recharge = i;
        }

        public final void setSuggestions(int i) {
            YallaTeamFeedbackType.Suggestions = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YallaTeamFeedbackType() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public YallaTeamFeedbackType(@NotNull String typeName, int i) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        this.typeName = typeName;
        this.typeId = i;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setTypeId(int i) {
        this.typeId = i;
    }

    public final void setTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeName = str;
    }

    public /* synthetic */ YallaTeamFeedbackType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
