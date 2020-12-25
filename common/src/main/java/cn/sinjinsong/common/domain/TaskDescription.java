package cn.sinjinsong.common.domain;

import cn.sinjinsong.common.enumeration.TaskType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDescription {
    private TaskType type;
    private String desc;
}
