package p597o0oo00OO;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.util.location.LocationModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.location.LocationGetAsync$getLocation$1", f = "LocationGetAsync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f57347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<LocationModel, Unit> f57348OooO0o0;

    public static final class OooO00o implements LocationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ LocationModel f57349OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00000OO f57350OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ LocationManager f57351OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<LocationModel, Unit> f57352OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(LocationModel locationModel, o00000OO o00000oo2, LocationManager locationManager, Function1<? super LocationModel, Unit> function1) {
            this.f57349OooO00o = locationModel;
            this.f57350OooO0O0 = o00000oo2;
            this.f57351OooO0OO = locationManager;
            this.f57352OooO0Oo = function1;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            LocationModel locationModel = this.f57349OooO00o;
            locationModel.f32317OooO0Oo = location;
            o00000OO o00000oo2 = this.f57350OooO0O0;
            o00000OO.OooO00o(o00000oo2, locationModel, location);
            o0000O00.OooO0O0(o00000oo2.f57354OooO0O0 + " getLocation \nlocationInfo = " + locationModel + ", \nlocation = " + location);
            if (o00000oo2.f57357OooO0o0) {
                this.f57351OooO0OO.removeUpdates(this);
            }
            Function1<LocationModel, Unit> function1 = this.f57352OooO0Oo;
            if (function1 != null) {
                function1.invoke(locationModel);
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(@NotNull String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(@NotNull String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(@NotNull String provider, int i, @NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(extras, "extras");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(o00000OO o00000oo2, Function1<? super LocationModel, Unit> function1, Continuation<? super o00000O> continuation) {
        super(2, continuation);
        this.f57347OooO0Oo = o00000oo2;
        this.f57348OooO0o0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O(this.f57347OooO0Oo, this.f57348OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Location location;
        Function1<LocationModel, Unit> function1 = this.f57348OooO0o0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00000OO o00000oo2 = this.f57347OooO0Oo;
        FragmentActivity fragmentActivity = o00000oo2.f57353OooO00o;
        long j = o00000oo2.f57355OooO0OO;
        Object systemService = fragmentActivity.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        LocationModel locationModel = new LocationModel();
        locationManager.isProviderEnabled("gps");
        locationManager.isProviderEnabled("network");
        locationManager.isProviderEnabled("passive");
        try {
            Looper.prepare();
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
            Location lastKnownLocation3 = locationManager.getLastKnownLocation("passive");
            boolean z = true;
            if (lastKnownLocation != null) {
                location = lastKnownLocation3;
                lastKnownLocation2 = lastKnownLocation;
            } else {
                if (lastKnownLocation2 != null) {
                    location = lastKnownLocation3;
                } else {
                    if (lastKnownLocation3 == null) {
                        z = false;
                    }
                    if (z) {
                        location = lastKnownLocation3;
                        lastKnownLocation2 = location;
                    } else {
                        OooO00o oooO00o = new OooO00o(locationModel, o00000oo2, locationManager, function1);
                        location = lastKnownLocation3;
                        locationManager.requestLocationUpdates("gps", o00000oo2.f57356OooO0Oo, j, oooO00o, Looper.myLooper());
                        locationManager.requestLocationUpdates("network", o00000oo2.f57356OooO0Oo, j, oooO00o, Looper.myLooper());
                        lastKnownLocation2 = null;
                    }
                }
            }
            if (lastKnownLocation2 != null) {
                locationModel.f32317OooO0Oo = lastKnownLocation2;
                o00000OO.OooO00o(o00000oo2, locationModel, lastKnownLocation2);
                o0000O00.OooO0O0(o00000oo2.f57354OooO0O0 + " getLocation \nlocationGPS=" + lastKnownLocation + ", \nlocationNetwork=" + lastKnownLocation2 + ", \nlocationPassive=" + location + ", \nlocationInfo=" + locationModel);
                if (function1 != null) {
                    function1.invoke(locationModel);
                }
                Looper.loop();
                return Unit.INSTANCE;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
