package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019OooOooO.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 ~2\u00020\u0001:\n\u007f\u0080\u0001~\u0081\u0001\u0082\u0001\u0083\u0001B\t\b\u0000¢\u0006\u0004\b|\u0010}J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ,\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0017J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#J\u0010\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010#J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0018J\b\u0010.\u001a\u00020\u0006H\u0016J\u0016\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u001e\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00105\u001a\u0002042\u0006\u00102\u001a\u000201J\u001e\u00108\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06H\u0007J$\u00108\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u001c\u00108\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u001e\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J$\u00108\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u0016\u0010;\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010:\u001a\u000209J\u0016\u0010<\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010:\u001a\u000209J\u000e\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010=\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010>\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06H\u0007J$\u0010>\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u001c\u0010>\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u001e\u0010>\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J$\u0010>\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J\u001e\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J(\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001062\b\u0010@\u001a\u0004\u0018\u00010#J\u001e\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J(\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001062\b\u0010@\u001a\u0004\u0018\u00010#J\u001e\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J(\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001062\b\u0010@\u001a\u0004\u0018\u00010#J\u001e\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106J\u0016\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\u0006\u0010:\u001a\u000209J\u0016\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010:\u001a\u000209J(\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001062\b\u0010@\u001a\u0004\u0018\u00010#J.\u0010?\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#062\b\u0010@\u001a\u0004\u0018\u00010#J$\u0010?\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06J$\u0010C\u001a\u00060BR\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010#H\u0007J\u0010\u0010E\u001a\u00020D2\u0006\u0010:\u001a\u000209H\u0014J\u0018\u0010F\u001a\u00020D2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106H\u0014J\b\u0010G\u001a\u00020DH\u0014J\u0010\u0010I\u001a\u00020\u00162\u0006\u0010H\u001a\u00020DH\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010J\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u00108\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06H\u0002J\u0018\u0010<\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\u0006\u0010:\u001a\u000209H\u0002J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020AH\u0002J\u001e\u0010>\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020A2\f\u00107\u001a\b\u0012\u0004\u0012\u00020#06H\u0002J \u0010?\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0002J\u0018\u0010K\u001a\u00020\u00062\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106H\u0002J\u0018\u0010L\u001a\u00020\u00062\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000106H\u0002J\u0018\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020M2\u0006\u0010H\u001a\u00020DH\u0002J\u001c\u0010Q\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010P\u001a\u0004\u0018\u00010DH\u0002JL\u0010Y\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010S\u001a\u00020R2\u0014\u0010U\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010X\u001a\u00020\u00182\b\u0010H\u001a\u0004\u0018\u00010DH\u0002J\u0018\u0010Z\u001a\u00020\u00182\u0006\u0010N\u001a\u00020M2\u0006\u0010H\u001a\u00020DH\u0002J\u0010\u0010\\\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u0016H\u0002JH\u0010d\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010a\u001a\u0004\u0018\u00010D2\b\u0010W\u001a\u0004\u0018\u00010b2\u0006\u0010c\u001a\u00020\u00182\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J \u0010e\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00105\u001a\u000204H\u0002J\u0010\u0010g\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0018H\u0002R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010i\u001a\u0004\bj\u0010kR$\u0010!\u001a\u00020 2\u0006\u0010h\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010$\u001a\u00020#2\u0006\u0010h\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010rR\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010uR$\u0010v\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR$\u0010*\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010u\u001a\u0004\b*\u0010zR$\u0010,\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010u\u001a\u0004\b{\u0010zR\u0014\u0010f\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010z¨\u0006\u0084\u0001"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "Landroid/app/Activity;", "activity", "Lcom/facebook/GraphResponse;", "response", "", "resolveError", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/facebook/CallbackManager;", "callbackManager", "Landroid/app/Fragment;", "Landroidx/activity/result/OooOO0;", "activityResultRegistryOwner", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "callback", "registerCallback", "unregisterCallback", "", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "setLoginBehavior", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "setLoginTargetApp", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "setDefaultAudience", "", "authType", "setAuthType", "messengerPageId", "setMessengerPageId", "resetMessengerState", "setResetMessengerState", "isFamilyLogin", "setFamilyLogin", "shouldSkipAccountDeduplication", "setShouldSkipAccountDeduplication", "logOut", "Landroid/content/Context;", "context", "Lcom/facebook/LoginStatusCallback;", "responseCallback", "retrieveLoginStatus", "", "toastDurationMs", "", "permissions", "logInWithReadPermissions", "Lcom/facebook/login/LoginConfiguration;", "loginConfig", "logInWithConfiguration", "loginWithConfiguration", "reauthorizeDataAccess", "logInWithPublishPermissions", "logIn", "loggerID", "Lcom/facebook/internal/FragmentWrapper;", "Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "createLogInActivityResultContract", "Lcom/facebook/login/LoginClient$Request;", "createLoginRequestWithConfig", "createLoginRequest", "createReauthorizeRequest", "request", "getFacebookActivityIntent", "createLoginRequestFromResponse", "validateReadPermissions", "validatePublishPermissions", "Lcom/facebook/login/StartActivityDelegate;", "startActivityDelegate", "startLogin", "loginRequest", "logStartLogin", "Lcom/facebook/login/LoginClient$Result$Code;", ReportItem.QualityKeyResult, "", "resultExtras", "Ljava/lang/Exception;", "exception", "wasLoginActivityTried", "logCompleteLogin", "tryFacebookActivity", "intent", "resolveIntent", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "finishLogin", "retrieveLoginStatusImpl", "isExpressLoginAllowed", "setExpressLoginStatus", "<set-?>", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "Z", "loginTargetApp", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "()Z", "getShouldSkipAccountDeduplication", "<init>", "()V", "Companion", "ActivityStartActivityDelegate", "AndroidxActivityResultRegistryOwnerStartActivityDelegate", "FacebookLoginActivityResultContract", "FragmentStartActivityDelegate", "LoginLoggerHolder", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class LoginManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";

    @NotNull
    private static final String MANAGE_PERMISSION_PREFIX = "manage";

    @NotNull
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;

    @NotNull
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";

    @NotNull
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";

    @NotNull
    private static final String TAG;
    private static volatile LoginManager instance;
    private boolean isFamilyLogin;

    @Nullable
    private String messengerPageId;
    private boolean resetMessengerState;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;

    @NotNull
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    @NotNull
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

    @NotNull
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;

    @NotNull
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/LoginManager$ActivityStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityContext", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityStartActivityDelegate implements StartActivityDelegate {

        @NotNull
        private final Activity activityContext;

        public ActivityStartActivityDelegate(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityContext = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        @NotNull
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            getActivityContext().startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "Landroidx/activity/result/OooOO0;", "activityResultRegistryOwner", "Landroidx/activity/result/OooOO0;", "Lcom/facebook/CallbackManager;", "callbackManager", "Lcom/facebook/CallbackManager;", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "activityContext", "<init>", "(Landroidx/activity/result/OooOO0;Lcom/facebook/CallbackManager;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {

        @NotNull
        private final androidx.activity.result.OooOO0 activityResultRegistryOwner;

        @NotNull
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager) {
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
            this.activityResultRegistryOwner = activityResultRegistryOwner;
            this.callbackManager = callbackManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: startActivityForResult$lambda-0, reason: not valid java name */
        public static final void m4179startActivityForResult$lambda0(AndroidxActivityResultRegistryOwnerStartActivityDelegate this$0, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder launcherHolder, Pair pair) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
            CallbackManager callbackManager = this$0.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "result.first");
            callbackManager.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            androidx.activity.result.OooO0O0<Intent> launcher = launcherHolder.getLauncher();
            if (launcher != null) {
                launcher.OooO0OO();
            }
            launcherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        @Nullable
        public Activity getActivityContext() {
            Object obj = this.activityResultRegistryOwner;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            final LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().OooO0Oo("facebook-login", new p011OooOo0.OooOO0<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // p011OooOo0.OooOO0
                @NotNull
                public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(input, "input");
                    return input;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p011OooOo0.OooOO0
                @NotNull
                public Pair<Integer, Intent> parseResult(int resultCode, @Nullable Intent intent2) {
                    Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(resultCode), intent2);
                    Intrinsics.checkNotNullExpressionValue(pairCreate, "create(resultCode, intent)");
                    return pairCreate;
                }
            }, new androidx.activity.result.OooO00o() { // from class: com.facebook.login.Oooo0
                @Override // androidx.activity.result.OooO00o
                public final void onActivityResult(Object obj) {
                    LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.m4179startActivityForResult$lambda0(this.f13758OooO0Oo, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, (Pair) obj);
                }
            }));
            androidx.activity.result.OooO0O0<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher == null) {
                return;
            }
            launcher.OooO0O0(intent);
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0017J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006)"}, d2 = {"Lcom/facebook/login/LoginManager$Companion;", "", "()V", "EXPRESS_LOGIN_ALLOWED", "", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "instance", "Lcom/facebook/login/LoginManager;", "otherPublishPermissions", "getOtherPublishPermissions", "()Ljava/util/Set;", "computeLoginResult", "Lcom/facebook/login/LoginResult;", "request", "Lcom/facebook/login/LoginClient$Request;", "newToken", "Lcom/facebook/AccessToken;", "newIdToken", "Lcom/facebook/AuthenticationToken;", "getExtraDataFromIntent", "", "intent", "Landroid/content/Intent;", "getInstance", "handleLoginStatusError", "", "errorType", "errorDescription", "loggerRef", "logger", "Lcom/facebook/login/LoginLogger;", "responseCallback", "Lcom/facebook/LoginStatusCallback;", "isPublishPermission", "", "permission", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(String errorType, String errorDescription, String loggerRef, LoginLogger logger, LoginStatusCallback responseCallback) {
            FacebookException facebookException = new FacebookException(errorType + ": " + ((Object) errorDescription));
            logger.logLoginStatusError(loggerRef, facebookException);
            responseCallback.onError(facebookException);
        }

        @JvmStatic
        @VisibleForTesting(otherwise = 2)
        @NotNull
        public final LoginResult computeLoginResult(@NotNull LoginClient.Request request, @NotNull AccessToken newToken, @Nullable AuthenticationToken newIdToken) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            Set<String> permissions = request.getPermissions();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.getPermissions()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(permissions);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(permissions));
            mutableSet2.removeAll(mutableSet);
            return new LoginResult(newToken, newIdToken, mutableSet, mutableSet2);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Nullable
        public final Map<String, String> getExtraDataFromIntent(@Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        @JvmStatic
        @NotNull
        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    LoginManager.instance = new LoginManager();
                    Unit unit = Unit.INSTANCE;
                }
            }
            LoginManager loginManager = LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            throw null;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean isPublishPermission(@Nullable String permission) {
            return permission != null && (StringsKt__StringsJVMKt.startsWith$default(permission, LoginManager.PUBLISH_PERMISSION_PREFIX, false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(permission, LoginManager.MANAGE_PERMISSION_PREFIX, false, 2, null) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(permission));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "LOooOo0/OooOO0;", "", "", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "Landroid/content/Context;", "context", "permissions", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "Lcom/facebook/CallbackManager;", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "loggerID", "Ljava/lang/String;", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "<init>", "(Lcom/facebook/login/LoginManager;Lcom/facebook/CallbackManager;Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class FacebookLoginActivityResultContract extends p011OooOo0.OooOO0<Collection<? extends String>, CallbackManager.ActivityResultParameters> {

        @Nullable
        private CallbackManager callbackManager;

        @Nullable
        private String loggerID;

        public FacebookLoginActivityResultContract(@Nullable LoginManager this$0, @Nullable CallbackManager callbackManager, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            LoginManager.this = this$0;
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }

        @Override // p011OooOo0.OooOO0
        public /* bridge */ /* synthetic */ Intent createIntent(Context context, Collection<? extends String> collection) {
            return createIntent2(context, (Collection<String>) collection);
        }

        @Nullable
        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        @Nullable
        public final String getLoggerID() {
            return this.loggerID;
        }

        public final void setCallbackManager(@Nullable CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final void setLoggerID(@Nullable String str) {
            this.loggerID = str;
        }

        @NotNull
        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public Intent createIntent2(@NotNull Context context, @NotNull Collection<String> permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            LoginClient.Request requestCreateLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                requestCreateLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, requestCreateLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(requestCreateLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestCreateLoginRequestWithConfig);
            throw facebookException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p011OooOo0.OooOO0
        @NotNull
        public CallbackManager.ActivityResultParameters parseResult(int resultCode, @Nullable Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, resultCode, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, resultCode, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, resultCode, intent);
        }

        public /* synthetic */ FacebookLoginActivityResultContract(CallbackManager callbackManager, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(LoginManager.this, (i & 1) != 0 ? null : callbackManager, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/LoginManager$FragmentStartActivityDelegate;", "Lcom/facebook/login/StartActivityDelegate;", "fragment", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;)V", "activityContext", "Landroid/app/Activity;", "getActivityContext", "()Landroid/app/Activity;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FragmentStartActivityDelegate implements StartActivityDelegate {

        @Nullable
        private final Activity activityContext;

        @NotNull
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(@NotNull FragmentWrapper fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.activityContext = fragment.getActivity();
        }

        @Override // com.facebook.login.StartActivityDelegate
        @Nullable
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int requestCode) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.fragment.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/login/LoginManager$LoginLoggerHolder;", "", "()V", "logger", "Lcom/facebook/login/LoginLogger;", "getLogger", "context", "Landroid/content/Context;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LoginLoggerHolder {

        @NotNull
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();

        @Nullable
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
        @Nullable
        public final synchronized LoginLogger getLogger(@Nullable Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (logger == null) {
                    logger = new LoginLogger(context, FacebookSdk.getApplicationId());
                }
                return logger;
            }
            context = FacebookSdk.getApplicationContext();
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
            throw th;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String string = LoginManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "LoginManager::class.java.toString()");
        TAG = string;
    }

    public LoginManager() {
        Validate.sdkInitialized();
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (!FacebookSdk.hasCustomTabsPrefetching || CustomTabUtils.getChromePackage() == null) {
            return;
        }
        CustomTabPrefetchHelper customTabPrefetchHelper = new CustomTabPrefetchHelper();
        Context applicationContext = FacebookSdk.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        applicationContext.bindService(intent, customTabPrefetchHelper, 33);
        Context applicationContext2 = FacebookSdk.getApplicationContext();
        String packageName = FacebookSdk.getApplicationContext().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext3 = applicationContext2.getApplicationContext();
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(applicationContext3);
        try {
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(packageName)) {
                intent2.setPackage(packageName);
            }
            applicationContext3.bindService(intent2, o0oo0oo2, 33);
        } catch (SecurityException unused) {
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @NotNull
    public static final LoginResult computeLoginResult(@NotNull LoginClient.Request request, @NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
        return INSTANCE.computeLoginResult(request, accessToken, authenticationToken);
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
        }
        if ((i & 1) != 0) {
            callbackManager = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return loginManager.createLogInActivityResultContract(callbackManager, str);
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse response) {
        Set<String> permissions;
        AccessToken accessToken = response.getRequest().getAccessToken();
        List listFilterNotNull = null;
        if (accessToken != null && (permissions = accessToken.getPermissions()) != null) {
            listFilterNotNull = CollectionsKt.filterNotNull(permissions);
        }
        return createLoginRequest(listFilterNotNull);
    }

    private final void finishLogin(AccessToken newToken, AuthenticationToken newIdToken, LoginClient.Request origRequest, FacebookException exception, boolean isCanceled, FacebookCallback<LoginResult> callback) {
        if (newToken != null) {
            AccessToken.INSTANCE.setCurrentAccessToken(newToken);
            Profile.INSTANCE.fetchProfileForCurrentAccessToken();
        }
        if (newIdToken != null) {
            AuthenticationToken.INSTANCE.setCurrentAuthenticationToken(newIdToken);
        }
        if (callback != null) {
            LoginResult loginResultComputeLoginResult = (newToken == null || origRequest == null) ? null : INSTANCE.computeLoginResult(origRequest, newToken, newIdToken);
            if (isCanceled || (loginResultComputeLoginResult != null && loginResultComputeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                callback.onCancel();
                return;
            }
            if (exception != null) {
                callback.onError(exception);
            } else {
                if (newToken == null || loginResultComputeLoginResult == null) {
                    return;
                }
                setExpressLoginStatus(true);
                callback.onSuccess(loginResultComputeLoginResult);
            }
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final Map<String, String> getExtraDataFromIntent(@Nullable Intent intent) {
        return INSTANCE.getExtraDataFromIntent(intent);
    }

    @JvmStatic
    @NotNull
    public static LoginManager getInstance() {
        return INSTANCE.getInstance();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isPublishPermission(@Nullable String str) {
        return INSTANCE.isPublishPermission(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code result, Map<String, String> resultExtras, Exception exception, boolean wasLoginActivityTried, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map = new HashMap();
        map.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, wasLoginActivityTried ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        logger.logCompleteLogin(request.getAuthId(), map, result, resultExtras, exception, request.getIsFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request loginRequest) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || loginRequest == null) {
            return;
        }
        logger.logStartLogin(loginRequest, loginRequest.getIsFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
    }

    private final void loginWithConfiguration(FragmentWrapper fragment, LoginConfiguration loginConfig) {
        logIn(fragment, loginConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i, Intent intent, FacebookCallback facebookCallback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i2 & 4) != 0) {
            facebookCallback = null;
        }
        return loginManager.onActivityResult(i, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerCallback$lambda-0, reason: not valid java name */
    public static final boolean m4176registerCallback$lambda0(LoginManager this$0, FacebookCallback facebookCallback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.onActivityResult(i, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void retrieveLoginStatusImpl(Context context, final LoginStatusCallback responseCallback, long toastDurationMs) {
        final String applicationId = FacebookSdk.getApplicationId();
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        final LoginLogger loginLogger = new LoginLogger(context == null ? FacebookSdk.getApplicationContext() : context, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(string);
            responseCallback.onFailure();
            return;
        }
        LoginStatusClient loginStatusClientNewInstance$facebook_common_release = LoginStatusClient.INSTANCE.newInstance$facebook_common_release(context, applicationId, string, FacebookSdk.getGraphApiVersion(), toastDurationMs, null);
        loginStatusClientNewInstance$facebook_common_release.setCompletedListener(new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.OooOo
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                LoginManager.m4177retrieveLoginStatusImpl$lambda2(string, loginLogger, responseCallback, applicationId, bundle);
            }
        });
        loginLogger.logLoginStatusStart(string);
        if (loginStatusClientNewInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(string);
        responseCallback.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveLoginStatusImpl$lambda-2, reason: not valid java name */
    public static final void m4177retrieveLoginStatusImpl$lambda2(String loggerRef, LoginLogger logger, LoginStatusCallback responseCallback, String applicationId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(loggerRef, "$loggerRef");
        Intrinsics.checkNotNullParameter(logger, "$logger");
        Intrinsics.checkNotNullParameter(responseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        if (bundle == null) {
            logger.logLoginStatusFailure(loggerRef);
            responseCallback.onFailure();
            return;
        }
        String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
        String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
        if (string != null) {
            INSTANCE.handleLoginStatusError(string, string2, loggerRef, logger, responseCallback);
            return;
        }
        String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        Utility utility = Utility.INSTANCE;
        Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
        String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
        String string5 = bundle.getString("graph_domain");
        Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
        String userIDFromSignedRequest = !(string4 == null || string4.length() == 0) ? LoginMethodHandler.INSTANCE.getUserIDFromSignedRequest(string4) : null;
        if (!(string3 == null || string3.length() == 0)) {
            if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                if (!(userIDFromSignedRequest == null || userIDFromSignedRequest.length() == 0)) {
                    AccessToken accessToken = new AccessToken(string3, applicationId, userIDFromSignedRequest, stringArrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
                    AccessToken.INSTANCE.setCurrentAccessToken(accessToken);
                    Profile.INSTANCE.fetchProfileForCurrentAccessToken();
                    logger.logLoginStatusSuccess(loggerRef);
                    responseCallback.onCompleted(accessToken);
                    return;
                }
            }
        }
        logger.logLoginStatusFailure(loggerRef);
        responseCallback.onFailure();
    }

    private final void setExpressLoginStatus(boolean isExpressLoginAllowed) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean(EXPRESS_LOGIN_ALLOWED, isExpressLoginAllowed);
        editorEdit.apply();
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) throws FacebookException {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.INSTANCE.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.Oooo000
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, Intent intent) {
                return LoginManager.m4178startLogin$lambda1(this.f13760OooO00o, i, intent);
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startLogin$lambda-1, reason: not valid java name */
    public static final boolean m4178startLogin$lambda1(LoginManager this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return onActivityResult$default(this$0, i, intent, null, 4, null);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(facebookActivityIntent, LoginClient.INSTANCE.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void validatePublishPermissions(Collection<String> permissions) {
        if (permissions == null) {
            return;
        }
        for (String str : permissions) {
            if (!INSTANCE.isPublishPermission(str)) {
                throw new FacebookException(p004OooO0oO.o000oOoO.OooO0O0("Cannot pass a read permission (", str, ") to a request for publish authorization"));
            }
        }
    }

    private final void validateReadPermissions(Collection<String> permissions) {
        if (permissions == null) {
            return;
        }
        for (String str : permissions) {
            if (INSTANCE.isPublishPermission(str)) {
                throw new FacebookException(p004OooO0oO.o000oOoO.OooO0O0("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
            }
        }
    }

    @JvmOverloads
    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    @NotNull
    public LoginClient.Request createLoginRequest(@Nullable Collection<String> permissions) {
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = permissions == null ? null : CollectionsKt.toSet(permissions);
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str, applicationId, string, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setRerequest(AccessToken.INSTANCE.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public LoginClient.Request createLoginRequestWithConfig(@NotNull LoginConfiguration loginConfig) {
        String codeVerifier;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
            codeVerifier = PKCEUtil.generateCodeChallenge(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        LoginBehavior loginBehavior = this.loginBehavior;
        Set set = CollectionsKt.toSet(loginConfig.getPermissions());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginTargetApp loginTargetApp = this.loginTargetApp;
        String nonce = loginConfig.getNonce();
        String codeVerifier2 = loginConfig.getCodeVerifier();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, set, defaultAudience, str, applicationId, string, loginTargetApp, nonce, codeVerifier2, codeVerifier, codeChallengeMethod);
        request.setRerequest(AccessToken.INSTANCE.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public LoginClient.Request createReauthorizeRequest() {
        LoginBehavior loginBehavior = LoginBehavior.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        DefaultAudience defaultAudience = this.defaultAudience;
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, hashSet, defaultAudience, "reauthorize", applicationId, string, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public final String getAuthType() {
        return this.authType;
    }

    @NotNull
    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    @NotNull
    public Intent getFacebookActivityIntent(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    @NotNull
    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    @NotNull
    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    /* JADX INFO: renamed from: isFamilyLogin, reason: from getter */
    public final boolean getIsFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final void logIn(@NotNull Fragment fragment, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), permissions);
    }

    public final void logInWithConfiguration(@NotNull Fragment fragment, @NotNull LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        loginWithConfiguration(new FragmentWrapper(fragment), loginConfig);
    }

    @Deprecated(message = "")
    public final void logInWithPublishPermissions(@NotNull Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions);
    }

    @Deprecated(message = "")
    public final void logInWithReadPermissions(@NotNull Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions);
    }

    public void logOut() {
        AccessToken.INSTANCE.setCurrentAccessToken(null);
        AuthenticationToken.INSTANCE.setCurrentAuthenticationToken(null);
        Profile.INSTANCE.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    @JvmOverloads
    @VisibleForTesting(otherwise = 3)
    public final boolean onActivityResult(int i, @Nullable Intent intent) {
        return onActivityResult$default(this, i, intent, null, 4, null);
    }

    public final void reauthorizeDataAccess(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void registerCallback(@Nullable CallbackManager callbackManager, @Nullable final FacebookCallback<LoginResult> callback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.OooOo00
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, Intent intent) {
                return LoginManager.m4176registerCallback$lambda0(this.f13756OooO00o, callback, i, intent);
            }
        });
    }

    public final void resolveError(@NotNull Activity activity, @NotNull GraphResponse response) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(response));
    }

    public final void retrieveLoginStatus(@NotNull Context context, @NotNull LoginStatusCallback responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatus(context, 5000L, responseCallback);
    }

    @NotNull
    public final LoginManager setAuthType(@NotNull String authType) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        this.authType = authType;
        return this;
    }

    @NotNull
    public final LoginManager setDefaultAudience(@NotNull DefaultAudience defaultAudience) {
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        this.defaultAudience = defaultAudience;
        return this;
    }

    @NotNull
    public final LoginManager setFamilyLogin(boolean isFamilyLogin) {
        this.isFamilyLogin = isFamilyLogin;
        return this;
    }

    @NotNull
    public final LoginManager setLoginBehavior(@NotNull LoginBehavior loginBehavior) {
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        this.loginBehavior = loginBehavior;
        return this;
    }

    @NotNull
    public final LoginManager setLoginTargetApp(@NotNull LoginTargetApp targetApp) {
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        this.loginTargetApp = targetApp;
        return this;
    }

    @NotNull
    public final LoginManager setMessengerPageId(@Nullable String messengerPageId) {
        this.messengerPageId = messengerPageId;
        return this;
    }

    @NotNull
    public final LoginManager setResetMessengerState(boolean resetMessengerState) {
        this.resetMessengerState = resetMessengerState;
        return this;
    }

    @NotNull
    public final LoginManager setShouldSkipAccountDeduplication(boolean shouldSkipAccountDeduplication) {
        this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        return this;
    }

    public final void unregisterCallback(@Nullable CallbackManager callbackManager) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    @JvmOverloads
    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract(@Nullable CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    public final void logIn(@NotNull Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), permissions, loggerID);
    }

    public final void logInWithPublishPermissions(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
        }
        logInWithPublishPermissions(activity, callbackManager, permissions);
    }

    public final void logInWithReadPermissions(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
        }
        logInWithReadPermissions(activity, callbackManager, permissions);
    }

    public final void loginWithConfiguration(@NotNull Activity activity, @NotNull LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        logIn(activity, loginConfig);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    @JvmOverloads
    @VisibleForTesting(otherwise = 3)
    public boolean onActivityResult(int resultCode, @Nullable Intent data, @Nullable FacebookCallback<LoginResult> callback) {
        LoginClient.Result.Code code;
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (data != null) {
            data.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) data.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (resultCode != -1) {
                    z2 = resultCode == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z = z2;
                authenticationToken = authenticationToken2;
                code = code3;
            } else {
                code = code2;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z = false;
            }
        } else if (resultCode == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z = true;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
        } else {
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request2 = request;
        logCompleteLogin(null, code, map, facebookException2, true, request2);
        finishLogin(accessToken, authenticationToken, request2, facebookException2, z, callback);
        return true;
    }

    @Deprecated(message = "")
    public final void resolveError(@NotNull Fragment fragment, @NotNull GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    public final void retrieveLoginStatus(@NotNull Context context, long toastDurationMs, @NotNull LoginStatusCallback responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        retrieveLoginStatusImpl(context, responseCallback, toastDurationMs);
    }

    @JvmOverloads
    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract(@Nullable CallbackManager callbackManager, @Nullable String loggerID) {
        return new FacebookLoginActivityResultContract(this, callbackManager, loggerID);
    }

    public final void logIn(@NotNull android.app.Fragment fragment, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), permissions);
    }

    public final void reauthorizeDataAccess(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        reauthorizeDataAccess(new FragmentWrapper(fragment));
    }

    public final void resolveError(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, response);
            return;
        }
        throw new FacebookException(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragment) {
        startLogin(new FragmentStartActivityDelegate(fragment), createReauthorizeRequest());
    }

    public final void logIn(@NotNull android.app.Fragment fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), permissions, loggerID);
    }

    public final void logIn(@NotNull FragmentWrapper fragment, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        logIn(fragment, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithPublishPermissions(@NotNull android.app.Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions);
    }

    public final void logInWithReadPermissions(@NotNull android.app.Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions);
    }

    private final void logInWithPublishPermissions(FragmentWrapper fragment, Collection<String> permissions) {
        validatePublishPermissions(permissions);
        loginWithConfiguration(fragment, new LoginConfiguration(permissions, null, 2, null));
    }

    private final void logInWithReadPermissions(FragmentWrapper fragment, Collection<String> permissions) {
        validateReadPermissions(permissions);
        logIn(fragment, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void resolveError(@NotNull android.app.Fragment fragment, @NotNull GraphResponse response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    private final void resolveError(FragmentWrapper fragment, GraphResponse response) {
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestFromResponse(response));
    }

    public final void logIn(@NotNull FragmentWrapper fragment, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            requestCreateLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new FragmentStartActivityDelegate(fragment), requestCreateLoginRequestWithConfig);
    }

    public final void resolveError(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull GraphResponse response) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestFromResponse(response));
    }

    public final void logInWithPublishPermissions(@NotNull Activity activity, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        validatePublishPermissions(permissions);
        loginWithConfiguration(activity, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithReadPermissions(@NotNull Activity activity, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        validateReadPermissions(permissions);
        logIn(activity, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logIn(@NotNull Activity activity, @Nullable Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        logIn(activity, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithPublishPermissions(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        validatePublishPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logInWithReadPermissions(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        validateReadPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, null));
    }

    public final void logIn(@NotNull FragmentWrapper fragment, @NotNull LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(@NotNull Activity activity, @NotNull LoginConfiguration loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof androidx.activity.result.OooOO0) {
            Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(@NotNull Activity activity, @Nullable Collection<String> permissions, @Nullable String loggerID) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            requestCreateLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new ActivityStartActivityDelegate(activity), requestCreateLoginRequestWithConfig);
    }

    private final void logIn(androidx.activity.result.OooOO0 activityResultRegistryOwner, CallbackManager callbackManager, LoginConfiguration loginConfig) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions, @Nullable String loggerID) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, null));
        if (loggerID != null) {
            requestCreateLoginRequestWithConfig.setAuthId(loggerID);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), requestCreateLoginRequestWithConfig);
    }

    public final void logIn(@NotNull androidx.activity.result.OooOO0 activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, null));
    }
}
