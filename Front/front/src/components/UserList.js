import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';

//inspirado de https://material-ui.com/es/components/cards/
const useStyles = makeStyles({
    root: {
        minWidth: 275,
    },
    bullet: {
        display: 'inline-block',
        margin: '0 2px',
        transform: 'scale(0.8)',
    },
    title: {
        fontSize: 14,
    },
    pos: {
        marginBottom: 12,
    },
});

export default function UserList(props) {
    const classes = useStyles();
    //const bull = <span className={classes.bullet}>•</span>;

    
    return (<div>
        
        {props.usersList.map((item, i) => {
            return (
                <Card className={classes.root} variant="outlined">
                    <CardContent>
                        <Typography className={classes.title} color="textSecondary" gutterBottom>
                            {item.id}
                        </Typography>
                        <Typography variant="h5" component="h2">
                            {item.name}
                        </Typography>
                        <Typography className={classes.pos} color="textSecondary">
                            {item.email}
                        </Typography>
                    </CardContent>
                    <CardActions>
                        <Button size="small">Learn More</Button>
                    </CardActions>
                </Card>
            )
        })}
    </div>
    );
}