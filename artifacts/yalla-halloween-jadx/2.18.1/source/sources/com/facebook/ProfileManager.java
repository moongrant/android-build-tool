package com.facebook;

import android.content.Intent;
import com.facebook.internal.Utility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0007\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/facebook/ProfileManager;", "", "Lcom/facebook/Profile;", "currentProfile", "", "writeToCache", "", "setCurrentProfile", "oldProfile", "sendCurrentProfileChangedBroadcast", "loadCurrentProfile", "Lcom/facebook/ProfileCache;", "profileCache", "Lcom/facebook/ProfileCache;", "currentProfileField", "Lcom/facebook/Profile;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getCurrentProfile", "()Lcom/facebook/Profile;", "(Lcom/facebook/Profile;)V", "Lo000OoOo/OooOo00;", "localBroadcastManager", "<init>", "(Lo000OoOo/OooOo00;Lcom/facebook/ProfileCache;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProfileManager {

    @NotNull
    public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";

    @NotNull
    public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    private static volatile ProfileManager instance;

    @Nullable
    private Profile currentProfileField;

    @NotNull
    private final p083o000OoOo.OooOo00 localBroadcastManager;

    @NotNull
    private final ProfileCache profileCache;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/ProfileManager$Companion;", "", "()V", "ACTION_CURRENT_PROFILE_CHANGED", "", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "instance", "Lcom/facebook/ProfileManager;", "getInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final synchronized ProfileManager getInstance() {
            ProfileManager profileManager;
            if (ProfileManager.instance == null) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                p083o000OoOo.OooOo00 oooOo00OooO00o = p083o000OoOo.OooOo00.OooO00o(FacebookSdk.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(oooOo00OooO00o, "getInstance(applicationContext)");
                ProfileManager.instance = new ProfileManager(oooOo00OooO00o, new ProfileCache());
            }
            profileManager = ProfileManager.instance;
            if (profileManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                throw null;
            }
            return profileManager;
        }
    }

    public ProfileManager(@NotNull p083o000OoOo.OooOo00 localBroadcastManager, @NotNull ProfileCache profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.localBroadcastManager = localBroadcastManager;
        this.profileCache = profileCache;
    }

    @JvmStatic
    @NotNull
    public static final synchronized ProfileManager getInstance() {
        return INSTANCE.getInstance();
    }

    private final void sendCurrentProfileChangedBroadcast(Profile oldProfile, Profile currentProfile) {
        Intent intent = new Intent(ACTION_CURRENT_PROFILE_CHANGED);
        intent.putExtra(EXTRA_OLD_PROFILE, oldProfile);
        intent.putExtra(EXTRA_NEW_PROFILE, currentProfile);
        this.localBroadcastManager.OooO0OO(intent);
    }

    @Nullable
    /* JADX INFO: renamed from: getCurrentProfile, reason: from getter */
    public final Profile getCurrentProfileField() {
        return this.currentProfileField;
    }

    public final boolean loadCurrentProfile() {
        Profile profileLoad = this.profileCache.load();
        if (profileLoad == null) {
            return false;
        }
        setCurrentProfile(profileLoad, false);
        return true;
    }

    public final void setCurrentProfile(@Nullable Profile profile) {
        setCurrentProfile(profile, true);
    }

    private final void setCurrentProfile(Profile currentProfile, boolean writeToCache) {
        Profile profile = this.currentProfileField;
        this.currentProfileField = currentProfile;
        if (writeToCache) {
            if (currentProfile != null) {
                this.profileCache.save(currentProfile);
            } else {
                this.profileCache.clear();
            }
        }
        Utility utility = Utility.INSTANCE;
        if (Utility.areObjectsEqual(profile, currentProfile)) {
            return;
        }
        sendCurrentProfileChangedBroadcast(profile, currentProfile);
    }
}
