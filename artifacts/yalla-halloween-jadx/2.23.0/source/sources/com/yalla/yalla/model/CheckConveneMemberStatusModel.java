package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006'"}, d2 = {"Lcom/yalla/yalla/model/CheckConveneMemberStatusModel;", "", "()V", "canConvene", "", "getCanConvene", "()Z", "setCanConvene", "(Z)V", "conveneTimeLong", "", "getConveneTimeLong", "()I", "setConveneTimeLong", "(I)V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "hasMember", "getHasMember", "setHasMember", "lastConveneTime", "", "getLastConveneTime", "()Ljava/lang/String;", "setLastConveneTime", "(Ljava/lang/String;)V", "maxConveneCount", "getMaxConveneCount", "setMaxConveneCount", "state", "getState", "setState", "isEndTime", "prescription", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckConveneMemberStatusModel {
    private boolean canConvene;
    private long endTime;
    private boolean hasMember;
    private int state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private String lastConveneTime = "";
    private int maxConveneCount = 50;
    private int conveneTimeLong = 10;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/CheckConveneMemberStatusModel$Companion;", "", "()V", "clone", "Lcom/yalla/yalla/model/CheckConveneMemberStatusModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CheckConveneMemberStatusModel clone(@Nullable CheckConveneMemberStatusModel checkConveneMemberStatusModel) {
            CheckConveneMemberStatusModel checkConveneMemberStatusModel2 = new CheckConveneMemberStatusModel();
            if (checkConveneMemberStatusModel != null) {
                checkConveneMemberStatusModel2.setCanConvene(checkConveneMemberStatusModel.getCanConvene());
                checkConveneMemberStatusModel2.setHasMember(checkConveneMemberStatusModel.getHasMember());
                checkConveneMemberStatusModel2.setLastConveneTime(checkConveneMemberStatusModel.getLastConveneTime());
                checkConveneMemberStatusModel2.setMaxConveneCount(checkConveneMemberStatusModel.getMaxConveneCount());
                checkConveneMemberStatusModel2.setConveneTimeLong(checkConveneMemberStatusModel.getConveneTimeLong());
                checkConveneMemberStatusModel2.setState(checkConveneMemberStatusModel.getState());
            }
            return checkConveneMemberStatusModel2;
        }
    }

    public final boolean getCanConvene() {
        return this.canConvene;
    }

    public final int getConveneTimeLong() {
        return this.conveneTimeLong;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getHasMember() {
        return this.hasMember;
    }

    @NotNull
    public final String getLastConveneTime() {
        return this.lastConveneTime;
    }

    public final int getMaxConveneCount() {
        return this.maxConveneCount;
    }

    public final int getState() {
        return this.state;
    }

    public final boolean isEndTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jOooO = o0OoOo0.OooO(0L, this.lastConveneTime);
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(jOooO).length();
        if (1 <= length) {
            int i = 1;
            while (true) {
                jOooO *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jOooO > 0 && 604800000 + jOooO < jCurrentTimeMillis;
    }

    public final void setCanConvene(boolean z) {
        this.canConvene = z;
    }

    public final void setConveneTimeLong(int i) {
        this.conveneTimeLong = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setHasMember(boolean z) {
        this.hasMember = z;
    }

    public final void setLastConveneTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastConveneTime = str;
    }

    public final void setMaxConveneCount(int i) {
        this.maxConveneCount = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final boolean isEndTime(long prescription) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jOooO = o0OoOo0.OooO(0L, this.lastConveneTime);
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(jOooO).length();
        if (1 <= length) {
            int i = 1;
            while (true) {
                jOooO *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jOooO > 0 && prescription + jOooO < jCurrentTimeMillis;
    }
}
