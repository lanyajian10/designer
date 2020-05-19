package designMode.structural.adapter.objectAdapter;

import designMode.structural.adapter.service.Impl._220VImpl;
import designMode.structural.adapter.service._110V;
import lombok.Setter;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:40
 */
@Setter
public class ObjectAdapter implements _110V {
    private _220VImpl v1;


    @Override
    public void _110V() {
        v1._220();
    }
}
