
package rentalService.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Schedule", url="http://Schedule:8080")
public interface ScheduleService {

    @RequestMapping(method= RequestMethod.POST, path="/schedules")
    public void installSchedule(@RequestBody Schedule schedule);

}